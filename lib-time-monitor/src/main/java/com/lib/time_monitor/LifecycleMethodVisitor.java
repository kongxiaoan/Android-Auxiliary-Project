package com.lib.time_monitor;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @author: kpa
 * @time: 2021/3/7
 * @email: billkp@yeah.net
 **/
public class LifecycleMethodVisitor extends MethodVisitor {
    private String className;
    private String methodName;

    public LifecycleMethodVisitor(MethodVisitor methodVisitor, String className, String methodName) {
        super(Opcodes.ASM5, methodVisitor);
        this.className = className;
        this.methodName = methodName;
    }

    @Override
    public void visitCode() {
        super.visitCode();
        System.out.println("MethodVisitor visitCode --");
        mv.visitLdcInsn("TAG");

        mv.visitLdcInsn(className + "----->" + methodName);
        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "android/util/log", "i",
                "(Ljava/lang/String;Ljava/lang/String;)I", false);
        mv.visitInsn(Opcodes.POP);
    }
}
