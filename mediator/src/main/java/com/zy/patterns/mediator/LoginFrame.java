package com.zy.patterns.mediator;

import java.awt.*;

public class LoginFrame extends Frame implements Mediator {

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
    }

    public void init() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(4, 2));
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username"));
        add(textUser);
        add(new Label("Password"));
        add(textPass);
        add(buttonOK);
        add(buttonCancel);
    }

    public void run() {
        pack();
        setVisible(true);
    }

    public void exit(Object o) {
        System.out.println("exit");
        System.exit(0);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", checkboxGroup, false);
        checkLogin = new ColleagueCheckbox("Login", checkboxGroup, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOK = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOK.addActionListener(this::exit);
        buttonCancel.addActionListener(this::exit);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(true);
        } else {
            textUser.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    private void userPassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOK.setColleagueEnabled(true);
            } else {
                buttonOK.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(false);
        }
    }


}
