{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/mutable/MutableByte.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableByte",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable",
        "org.apache.commons.lang.mutable.Mutable"
      ],
      "begin_line": 25,
      "end_line": 276,
      "comment": "\n * A mutable \u003ccode\u003ebyte\u003c/code\u003e wrapper.\n * \n * @see Byte\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Serialization lock. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Constructs a new MutableByte with the default value of zero.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte(byte)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Constructs a new MutableByte with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)",
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte(java.lang.Number)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructs a new MutableByte with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)",
        "(line 61,col 9)-(line 61,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.getValue()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Gets the value as a Byte instance.\n     * \n     * @return the value as a Byte\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.setValue(byte)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.setValue(java.lang.Object)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.byteValue()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Returns the value of this MutableByte as a byte.\n     *\n     * @return the numeric value represented by this object after conversion to type byte.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.intValue()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns the value of this MutableByte as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.longValue()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns the value of this MutableByte as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.floatValue()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Returns the value of this MutableByte as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.doubleValue()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Returns the value of this MutableByte as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.toByte()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Gets this mutable as an instance of Byte.\n     *\n     * @return a Byte instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.increment()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.decrement()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.add(byte)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.add(java.lang.Number)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.subtract(byte)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.subtract(java.lang.Number)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.equals(java.lang.Object)",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableByte\u003c/code\u003e object that contains the same \u003ccode\u003ebyte\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.hashCode()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.compareTo(java.lang.Object)",
      "begin_line": 261,
      "end_line": 265,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableByte\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 46)",
        "(line 263,col 9)-(line 263,col 38)",
        "(line 264,col 9)-(line 264,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.toString()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 37)"
      ]
    }
  ]
}