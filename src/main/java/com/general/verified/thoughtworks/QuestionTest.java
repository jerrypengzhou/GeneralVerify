package com.general.verified.thoughtworks;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class QuestionTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Question.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void questionOne() {
    }

    @org.junit.Test
    public void questionTwo() {
    }

    @org.junit.Test
    public void questionThree() {
    }

    @org.junit.Test
    public void questionFour() {
    }

    @org.junit.Test
    public void questionFive() {
    }

    @org.junit.Test
    public void questionSix() {
    }

    @org.junit.Test
    public void questionSeven() {
    }

    @org.junit.Test
    public void questionEight() {
    }

    @org.junit.Test
    public void questionNine() {
    }

    @org.junit.Test
    public void questionTen() {
    }
}
