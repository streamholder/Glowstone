package net.glowstone.net.codec.play.entity;

import com.flowpowered.networking.Codec;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import net.glowstone.net.message.play.entity.RelativeEntityPositionRotationMessage;

import java.io.IOException;

public final class RelativeEntityPositionRotationCodec implements Codec<RelativeEntityPositionRotationMessage> {
    public RelativeEntityPositionRotationMessage decode(ByteBuf buf) throws IOException {
        throw new DecoderException("Cannot decode RelativeEntityPositionRotationMessage");
    }

    public ByteBuf encode(ByteBuf buf, RelativeEntityPositionRotationMessage message) throws IOException {
        buf.writeInt(message.getId());
        buf.writeByte(message.getDeltaX());
        buf.writeByte(message.getDeltaY());
        buf.writeByte(message.getDeltaZ());
        buf.writeByte(message.getRotation());
        buf.writeByte(message.getPitch());
        return buf;
    }
}
