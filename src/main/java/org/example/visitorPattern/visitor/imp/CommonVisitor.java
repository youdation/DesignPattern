package org.example.visitorPattern.visitor.imp;

import org.example.visitorPattern.ScenerySpot.imp.DolphinSpot;
import org.example.visitorPattern.ScenerySpot.imp.LeopardSpot;
import org.example.visitorPattern.visitor.Visitor;

// 普通游客
public class CommonVisitor implements Visitor {
    @Override
    public void visitorLeopardSpot(LeopardSpot leopardSpot) {
        System.out.println("学生游客游览豹子馆票价:" + leopardSpot.ticketRate());
    }

    @Override
    public void visitDolphinSpot(DolphinSpot dolphinSpot) {
        System.out.println("学生游览海豹馆票价:" + dolphinSpot.ticketRate());
    }
}
