import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class73 {

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!ma;")
	private BufferedSocket aClass95_1;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	private int anInt2962;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Lclient!pm;")
	private Class3_Sub2_Sub5_Sub2 aClass3_Sub2_Sub5_Sub2_2;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList aClass16_2 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList aClass16_3 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList aClass16_4 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList aClass16_5 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Lclient!wa;")
	private final Buffer aClass3_Sub15_4 = new Buffer(4);

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "B")
	private byte aByte8 = 0;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public volatile int anInt2964 = 0;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public volatile int anInt2963 = 0;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Lclient!wa;")
	private final Buffer aClass3_Sub15_5 = new Buffer(8);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
	public final boolean method2316() {
		return this.method2321() >= 20;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Z")
	public final boolean method2318() {
		@Pc(19) int local19;
		if (this.aClass95_1 != null) {
			@Pc(12) long local12 = MonotonicClock.method5096();
			local19 = (int) (local12 - this.aLong104);
			this.aLong104 = local12;
			if (local19 > 200) {
				local19 = 200;
			}
			this.anInt2962 += local19;
			if (this.anInt2962 > 30000) {
				try {
					this.aClass95_1.method2834();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass95_1 = null;
			}
		}
		if (this.aClass95_1 == null) {
			return this.method2328() == 0 && this.method2321() == 0;
		}
		try {
			this.aClass95_1.method2832();
			@Pc(75) Class3_Sub2_Sub5_Sub2 local75;
			for (local75 = (Class3_Sub2_Sub5_Sub2) this.aClass16_2.method795(); local75 != null; local75 = (Class3_Sub2_Sub5_Sub2) this.aClass16_2.method797()) {
				this.aClass3_Sub15_4.anInt2792 = 0;
				this.aClass3_Sub15_4.method2178(1);
				this.aClass3_Sub15_4.method2205((int) local75.aLong185);
				this.aClass95_1.method2830(this.aClass3_Sub15_4.aByteArray40, 4);
				this.aClass16_3.method798(local75);
			}
			for (local75 = (Class3_Sub2_Sub5_Sub2) this.aClass16_4.method795(); local75 != null; local75 = (Class3_Sub2_Sub5_Sub2) this.aClass16_4.method797()) {
				this.aClass3_Sub15_4.anInt2792 = 0;
				this.aClass3_Sub15_4.method2178(0);
				this.aClass3_Sub15_4.method2205((int) local75.aLong185);
				this.aClass95_1.method2830(this.aClass3_Sub15_4.aByteArray40, 4);
				this.aClass16_5.method798(local75);
			}
			for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
				local19 = this.aClass95_1.method2831();
				if (local19 < 0) {
					throw new IOException();
				}
				if (local19 == 0) {
					break;
				}
				this.anInt2962 = 0;
				@Pc(196) byte local196 = 0;
				if (this.aClass3_Sub2_Sub5_Sub2_2 == null) {
					local196 = 8;
				} else if (this.aClass3_Sub2_Sub5_Sub2_2.anInt4617 == 0) {
					local196 = 1;
				}
				@Pc(228) int local228;
				@Pc(235) int local235;
				@Pc(283) int local283;
				if (local196 <= 0) {
					local228 = this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.aByteArray40.length - this.aClass3_Sub2_Sub5_Sub2_2.aByte16;
					local235 = 512 - this.aClass3_Sub2_Sub5_Sub2_2.anInt4617;
					if (local235 > local228 - this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.anInt2792) {
						local235 = local228 - this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.anInt2792;
					}
					if (local235 > local19) {
						local235 = local19;
					}
					this.aClass95_1.method2827(this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.anInt2792, local235, this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.aByteArray40);
					if (this.aByte8 != 0) {
						for (local283 = 0; local283 < local235; local283++) {
							this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.aByteArray40[this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.anInt2792 + local283] = (byte) (this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.aByteArray40[this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.anInt2792 + local283] ^ this.aByte8);
						}
					}
					this.aClass3_Sub2_Sub5_Sub2_2.anInt4617 += local235;
					this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.anInt2792 += local235;
					if (this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.anInt2792 == local228) {
						this.aClass3_Sub2_Sub5_Sub2_2.method4365();
						this.aClass3_Sub2_Sub5_Sub2_2.aBoolean226 = false;
						this.aClass3_Sub2_Sub5_Sub2_2 = null;
					} else if (this.aClass3_Sub2_Sub5_Sub2_2.anInt4617 == 512) {
						this.aClass3_Sub2_Sub5_Sub2_2.anInt4617 = 0;
					}
				} else {
					local228 = local196 - this.aClass3_Sub15_5.anInt2792;
					if (local19 < local228) {
						local228 = local19;
					}
					this.aClass95_1.method2827(this.aClass3_Sub15_5.anInt2792, local228, this.aClass3_Sub15_5.aByteArray40);
					if (this.aByte8 != 0) {
						for (local235 = 0; local235 < local228; local235++) {
							this.aClass3_Sub15_5.aByteArray40[local235 + this.aClass3_Sub15_5.anInt2792] ^= this.aByte8;
						}
					}
					this.aClass3_Sub15_5.anInt2792 += local228;
					if (this.aClass3_Sub15_5.anInt2792 >= local196) {
						if (this.aClass3_Sub2_Sub5_Sub2_2 == null) {
							this.aClass3_Sub15_5.anInt2792 = 0;
							local235 = this.aClass3_Sub15_5.method2229();
							local283 = this.aClass3_Sub15_5.method2163();
							@Pc(471) int local471 = this.aClass3_Sub15_5.method2229();
							@Pc(476) int local476 = this.aClass3_Sub15_5.method2174();
							@Pc(480) int local480 = local471 & 0x7F;
							@Pc(491) boolean local491 = (local471 & 0x80) != 0;
							@Pc(501) long local501 = (long) ((local235 << 16) + local283);
							@Pc(509) Class3_Sub2_Sub5_Sub2 local509;
							if (local491) {
								for (local509 = (Class3_Sub2_Sub5_Sub2) this.aClass16_5.method795(); local509 != null && local509.aLong185 != local501; local509 = (Class3_Sub2_Sub5_Sub2) this.aClass16_5.method797()) {
								}
							} else {
								for (local509 = (Class3_Sub2_Sub5_Sub2) this.aClass16_3.method795(); local509 != null && local501 != local509.aLong185; local509 = (Class3_Sub2_Sub5_Sub2) this.aClass16_3.method797()) {
								}
							}
							if (local509 == null) {
								throw new IOException();
							}
							@Pc(568) int local568 = local480 == 0 ? 5 : 9;
							this.aClass3_Sub2_Sub5_Sub2_2 = local509;
							this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7 = new Buffer(local476 + local568 + this.aClass3_Sub2_Sub5_Sub2_2.aByte16);
							this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.method2178(local480);
							this.aClass3_Sub2_Sub5_Sub2_2.aClass3_Sub15_7.method2164(local476);
							this.aClass3_Sub2_Sub5_Sub2_2.anInt4617 = 8;
							this.aClass3_Sub15_5.anInt2792 = 0;
						} else if (this.aClass3_Sub2_Sub5_Sub2_2.anInt4617 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub15_5.aByteArray40[0] == -1) {
							this.aClass3_Sub2_Sub5_Sub2_2.anInt4617 = 1;
							this.aClass3_Sub15_5.anInt2792 = 0;
						} else {
							this.aClass3_Sub2_Sub5_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(644) IOException local644) {
			try {
				this.aClass95_1.method2834();
			} catch (@Pc(650) Exception local650) {
			}
			this.anInt2963 = -2;
			this.anInt2964++;
			this.aClass95_1 = null;
			return this.method2328() == 0 && this.method2321() == 0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public final void method2319() {
		if (this.aClass95_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub15_4.anInt2792 = 0;
			this.aClass3_Sub15_4.method2178(7);
			this.aClass3_Sub15_4.method2205(0);
			this.aClass95_1.method2830(this.aClass3_Sub15_4.aByteArray40, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass95_1.method2834();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt2964++;
			this.anInt2963 = -2;
			this.aClass95_1 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
	private int method2321() {
		return this.aClass16_4.method793() + this.aClass16_5.method793();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZ)V")
	public final void method2322(@OriginalArg(0) boolean arg0) {
		if (this.aClass95_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub15_4.anInt2792 = 0;
			this.aClass3_Sub15_4.method2178(arg0 ? 2 : 3);
			this.aClass3_Sub15_4.method2205(0);
			this.aClass95_1.method2830(this.aClass3_Sub15_4.aByteArray40, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass95_1.method2834();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt2964++;
			this.anInt2963 = -2;
			this.aClass95_1 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public final void method2323() {
		if (this.aClass95_1 != null) {
			this.aClass95_1.method2833();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!ma;I)V")
	public final void method2324(@OriginalArg(0) boolean arg0, @OriginalArg(1) BufferedSocket arg1) {
		if (this.aClass95_1 != null) {
			try {
				this.aClass95_1.method2834();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass95_1 = null;
		}
		this.aClass95_1 = arg1;
		this.method2331();
		this.method2322(arg0);
		this.aClass3_Sub15_5.anInt2792 = 0;
		this.aClass3_Sub2_Sub5_Sub2_2 = null;
		while (true) {
			@Pc(44) Class3_Sub2_Sub5_Sub2 local44 = (Class3_Sub2_Sub5_Sub2) this.aClass16_3.method796();
			if (local44 == null) {
				while (true) {
					local44 = (Class3_Sub2_Sub5_Sub2) this.aClass16_5.method796();
					if (local44 == null) {
						if (this.aByte8 != 0) {
							try {
								this.aClass3_Sub15_4.anInt2792 = 0;
								this.aClass3_Sub15_4.method2178(4);
								this.aClass3_Sub15_4.method2178(this.aByte8);
								this.aClass3_Sub15_4.method2230(0);
								this.aClass95_1.method2830(this.aClass3_Sub15_4.aByteArray40, 4);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass95_1.method2834();
								} catch (@Pc(113) Exception local113) {
								}
								this.anInt2963 = -2;
								this.anInt2964++;
								this.aClass95_1 = null;
							}
						}
						this.anInt2962 = 0;
						this.aLong104 = MonotonicClock.method5096();
						return;
					}
					this.aClass16_4.method798(local44);
				}
			}
			this.aClass16_2.method798(local44);
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)Z")
	public final boolean method2326() {
		return this.method2328() >= 20;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
	public final void method2327() {
		try {
			this.aClass95_1.method2834();
		} catch (@Pc(17) Exception local17) {
		}
		this.anInt2963 = -1;
		this.aByte8 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass95_1 = null;
		this.anInt2964++;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)I")
	public final int method2328() {
		return this.aClass16_2.method793() + this.aClass16_3.method793();
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public final void method2329() {
		if (this.aClass95_1 != null) {
			this.aClass95_1.method2834();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIBIZ)Lclient!pm;")
	public final Class3_Sub2_Sub5_Sub2 method2330(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class3_Sub2_Sub5_Sub2 local7 = new Class3_Sub2_Sub5_Sub2();
		@Pc(14) long local14 = (long) (arg2 + (arg0 << 16));
		local7.aBoolean225 = arg3;
		local7.aLong185 = local14;
		local7.aByte16 = arg1;
		if (arg3) {
			if (this.method2328() >= 20) {
				throw new RuntimeException();
			}
			this.aClass16_2.method798(local7);
		} else if (this.method2321() < 20) {
			this.aClass16_4.method798(local7);
		} else {
			throw new RuntimeException();
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
	private void method2331() {
		if (this.aClass95_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub15_4.anInt2792 = 0;
			this.aClass3_Sub15_4.method2178(6);
			this.aClass3_Sub15_4.method2205(3);
			this.aClass95_1.method2830(this.aClass3_Sub15_4.aByteArray40, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass95_1.method2834();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt2964++;
			this.aClass95_1 = null;
			this.anInt2963 = -2;
		}
	}
}
