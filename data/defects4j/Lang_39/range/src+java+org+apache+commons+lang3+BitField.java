{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/BitField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 290,
      "comment": "\n * \u003cp\u003eOperations on bit-mapped fields.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Apache Jakarta POI\n * @author Scott Sanders (sanders at apache dot org)\n * @author Marc Johnson (mjohnson at apache dot org)\n * @author Andrew C. Oliver (acoliver at apache dot org)\n * @author Pete Gieser\n * @author Gary Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "_mask"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "_shift_count"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.BitField.BitField(int)",
      "begin_line": 44,
      "end_line": 56,
      "comment": "\n     * \u003cp\u003eCreates a BitField instance.\u003c/p\u003e\n     *\n     * @param mask the mask specifying which bits apply to this\n     *  BitField. Bits that are set in this mask are the bits\n     *  that this BitField operates on\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 21)",
        "(line 46,col 9)-(line 46,col 22)",
        "(line 47,col 9)-(line 47,col 31)",
        "(line 49,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.getValue(int)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * \u003cp\u003eObtains the value for the specified BitField, appropriately\n     * shifted right.\u003c/p\u003e\n     *\n     * \u003cp\u003eMany users of a BitField will want to treat the specified\n     * bits as an int value, and will not want to be aware that the\n     * value is stored as a BitField (and so shifted left so many\n     * bits).\u003c/p\u003e\n     *\n     * @see #setValue(int,int)\n     * @param holder the int data containing the bits we\u0027re interested\n     *  in\n     * @return the selected bits, shifted right appropriately\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.getShortValue(short)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * \u003cp\u003eObtains the value for the specified BitField, appropriately\n     * shifted right, as a short.\u003c/p\u003e\n     *\n     * \u003cp\u003eMany users of a BitField will want to treat the specified\n     * bits as an int value, and will not want to be aware that the\n     * value is stored as a BitField (and so shifted left so many\n     * bits).\u003c/p\u003e\n     *\n     * @see #setShortValue(short,short)\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @return the selected bits, shifted right appropriately\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.getRawValue(int)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * \u003cp\u003eObtains the value for the specified BitField, unshifted.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @return the selected bits\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.getShortRawValue(short)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * \u003cp\u003eObtains the value for the specified BitField, unshifted.\u003c/p\u003e\n     *\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @return the selected bits\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.isSet(int)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eReturns whether the field is set or not.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is most commonly used for a single-bit field, which is\n     * often used to represent a boolean value; the results of using\n     * it for a multi-bit field is to determine whether *any* of its\n     * bits are set.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re interested\n     *  in\n     * @return \u003ccode\u003etrue\u003c/code\u003e if any of the bits are set,\n     *  else \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.isAllSet(int)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003eReturns whether all of the bits are set or not.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is a stricter test than {@link #isSet(int)},\n     * in that all of the bits in a multi-bit set must be set\n     * for this method to return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all of the bits are set,\n     *  else \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setValue(int, int)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eReplaces the bits with new values.\u003c/p\u003e\n     *\n     * @see #getValue(int)\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @param value the new value for the specified bits\n     * @return the value of holder with the bits from the value\n     *  parameter replacing the old bits\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setShortValue(short, short)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eReplaces the bits with new values.\u003c/p\u003e\n     *\n     * @see #getShortValue(short)\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @param value the new value for the specified bits\n     * @return the value of holder with the bits from the value\n     *  parameter replacing the old bits\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.clear(int)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * \u003cp\u003eClears the bits.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @return the value of holder with the specified bits cleared\n     *  (set to \u003ccode\u003e0\u003c/code\u003e)\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.clearShort(short)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eClears the bits.\u003c/p\u003e\n     *\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @return the value of holder with the specified bits cleared\n     *  (set to \u003ccode\u003e0\u003c/code\u003e)\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.clearByte(byte)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * \u003cp\u003eClears the bits.\u003c/p\u003e\n     *\n     * @param holder the byte data containing the bits we\u0027re\n     *  interested in\n     *\n     * @return the value of holder with the specified bits cleared\n     *  (set to \u003ccode\u003e0\u003c/code\u003e)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.set(int)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eSets the bits.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @return the value of holder with the specified bits set\n     *  to \u003ccode\u003e1\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setShort(short)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eSets the bits.\u003c/p\u003e\n     *\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @return the value of holder with the specified bits set\n     *  to \u003ccode\u003e1\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setByte(byte)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eSets the bits.\u003c/p\u003e\n     *\n     * @param holder the byte data containing the bits we\u0027re\n     *  interested in\n     *\n     * @return the value of holder with the specified bits set\n     *  to \u003ccode\u003e1\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setBoolean(int, boolean)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * \u003cp\u003eSets a boolean BitField.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @param flag indicating whether to set or clear the bits\n     * @return the value of holder with the specified bits set or\n     *         cleared\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setShortBoolean(short, boolean)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eSets a boolean BitField.\u003c/p\u003e\n     *\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @param flag indicating whether to set or clear the bits\n     * @return the value of holder with the specified bits set or\n     *  cleared\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setByteBoolean(byte, boolean)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eSets a boolean BitField.\u003c/p\u003e\n     *\n     * @param holder the byte data containing the bits we\u0027re\n     *  interested in\n     * @param flag indicating whether to set or clear the bits\n     * @return the value of holder with the specified bits set or\n     *  cleared\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 58)"
      ]
    }
  ]
}