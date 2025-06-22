package com.thaumicntm.inventory.mats;

import com.hbm.inventory.material.Mats;
import com.hbm.inventory.material.NTMMaterial;

import static com.hbm.inventory.material.MaterialShapes.*;
import static com.hbm.inventory.material.MaterialShapes.BLOCK;
import static com.thaumicntm.inventory.mats.ThaumOreDict.*;

public class ThaumMats {

    /** Add this to IDs used by this mod**/
    public static final int _MS = 25_000;

    public static final NTMMaterial MAT_THAUMIUM = Mats.makeSmeltable(_MS, THAUMIUM,		0x673499, 0x2c1c3b, 0x8945cc).setAutogen(CASTPLATE, WELDEDPLATE, BOLT, WIRE).m();



}
