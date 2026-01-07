{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/mutable/MutableByte.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableByte",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang.mutable.MutableByte\u003e",
        "org.apache.commons.lang.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 26,
      "end_line": 286,
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
        "(line 76,col 9)-(line 76,col 40)"
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
      "signature": "org.apache.commons.lang.mutable.MutableByte.setValue(java.lang.Number)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.byteValue()",
      "begin_line": 108,
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
      "end_line": 131,
      "comment": "\n     * Returns the value of this MutableByte as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.floatValue()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Returns the value of this MutableByte as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.doubleValue()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Returns the value of this MutableByte as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.toByte()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Gets this mutable as an instance of Byte.\n     *\n     * @return a Byte instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.increment()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.decrement()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.add(byte)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.add(java.lang.Number)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.subtract(byte)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.subtract(java.lang.Number)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.equals(java.lang.Object)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableByte\u003c/code\u003e object that contains the same \u003ccode\u003ebyte\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.hashCode()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.compareTo(org.apache.commons.lang.mutable.MutableByte)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableByte\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 38)",
        "(line 273,col 9)-(line 273,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableByte.toString()",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 37)"
      ]
    }
  ]
}