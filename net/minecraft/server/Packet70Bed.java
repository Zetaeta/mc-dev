package net.minecraft.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Packet70Bed extends Packet {

    public static final String[] a = new String[] { "tile.bed.notValid", null, null, "gameMode.changed"};
    public int b;
    public int c;

    public Packet70Bed() {}

    public Packet70Bed(int i, int j) {
        this.b = i;
        this.c = j;
    }

    public void a(DataInputStream datainputstream) throws IOException { // CraftBukkit - add throws declaration
        this.b = datainputstream.readByte();
        this.c = datainputstream.readByte();
    }

    public void a(DataOutputStream dataoutputstream) throws IOException { // CraftBukkit - add throws declaration
        dataoutputstream.writeByte(this.b);
        dataoutputstream.writeByte(this.c);
    }

    public void a(NetHandler nethandler) {
        nethandler.a(this);
    }

    public int a() {
        return 2;
    }
}
