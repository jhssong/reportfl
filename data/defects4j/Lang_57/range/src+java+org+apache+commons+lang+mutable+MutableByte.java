{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/mutable/MutableByte.java",
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
      "begin_line": 26,
      "end_line": 281,
      "comment": "\n * A mutable \u003ccode\u003ebyte\u003c/code\u003e wrapper.\n * \n * @see Byte\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructs a new MutableByte with the default value of zero.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte(byte)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Constructs a new MutableByte with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte(java.lang.Number)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Constructs a new MutableByte with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.getValue()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Gets the value as a Byte instance.\n     * \n     * @return the value as a Byte\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.setValue(byte)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.setValue(java.lang.Object)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.byteValue()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns the value of this MutableByte as a byte.\n     *\n     * @return the numeric value represented by this object after conversion to type byte.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.intValue()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Returns the value of this MutableByte as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.longValue()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns the value of this MutableByte as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.floatValue()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Returns the value of this MutableByte as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.doubleValue()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Returns the value of this MutableByte as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.toByte()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Gets this mutable as an instance of Byte.\n     *\n     * @return a Byte instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.increment()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.decrement()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.add(byte)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.add(java.lang.Number)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.subtract(byte)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.subtract(java.lang.Number)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.equals(java.lang.Object)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableByte\u003c/code\u003e object that contains the same \u003ccode\u003ebyte\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.hashCode()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.compareTo(java.lang.Object)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableByte\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 46)",
        "(line 268,col 9)-(line 268,col 38)",
        "(line 269,col 9)-(line 269,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.toString()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 37)"
      ]
    }
  ]
}