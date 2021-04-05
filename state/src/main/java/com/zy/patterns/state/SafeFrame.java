package com.zy.patterns.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {

    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonExit = new Button("结束");

    private State state = DayState.getInstance();

    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);

    }

    @Override
    public void setClock(int hour) {
        String clockStr = "现在时间是";
        if (hour < 10) {
            clockStr += "0" + hour + ":00";
        } else {
            clockStr += hour + ":00";
        }
        System.out.println(clockStr);
        textClock.setText(clockStr);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call... " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record... " + msg + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());

        if (e.getSource() == buttonUse) {
            state.doUse(this);
            return;
        }
        if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
            return;
        }
        if (e.getSource() == buttonPhone) {
            state.doPhone(this);
            return;
        }
        if (e.getSource() == buttonExit) {
            System.exit(0);
            return;
        }

        System.out.println("?");
    }
}
