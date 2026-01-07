{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/mutable/MutableByte.java",
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
      "end_line": 280,
      "comment": "\n * A mutable \u003ccode\u003ebyte\u003c/code\u003e wrapper.\n * \n * @see Byte\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Constructs a new MutableByte with the default value of zero.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte(byte)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Constructs a new MutableByte with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)",
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableByte.MutableByte(java.lang.Number)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Constructs a new MutableByte with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.getValue()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Gets the value as a Byte instance.\n     * \n     * @return the value as a Byte\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.setValue(byte)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.setValue(java.lang.Object)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.byteValue()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns the value of this MutableByte as a byte.\n     *\n     * @return the numeric value represented by this object after conversion to type byte.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.intValue()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Returns the value of this MutableByte as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.longValue()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Returns the value of this MutableByte as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.floatValue()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Returns the value of this MutableByte as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.doubleValue()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Returns the value of this MutableByte as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.toByte()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Gets this mutable as an instance of Byte.\n     *\n     * @return a Byte instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.increment()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.decrement()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.add(byte)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.add(java.lang.Number)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.subtract(byte)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.subtract(java.lang.Number)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.equals(java.lang.Object)",
      "begin_line": 241,
      "end_line": 246,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableByte\u003c/code\u003e object that contains the same \u003ccode\u003ebyte\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.hashCode()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.compareTo(java.lang.Object)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableByte\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 46)",
        "(line 267,col 9)-(line 267,col 38)",
        "(line 268,col 9)-(line 268,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.toString()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 37)"
      ]
    }
  ]
}