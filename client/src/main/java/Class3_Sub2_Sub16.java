import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class3_Sub2_Sub16 extends SecondaryNode {

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "Lclient!uj;")
	public final ObjStack aClass8_Sub7_1;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!uj;)V")
	public Class3_Sub2_Sub16(@OriginalArg(0) ObjStack arg0) {
		this.aClass8_Sub7_1 = arg0;
	}
}
