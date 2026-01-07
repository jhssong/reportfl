{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/mutable/MutableLong.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableLong",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable",
        "org.apache.commons.lang.mutable.Mutable"
      ],
      "begin_line": 25,
      "end_line": 271,
      "comment": "\n * A mutable \u003ccode\u003elong\u003c/code\u003e wrapper.\n * \n * @see Long\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.mutable.MutableLong.MutableLong()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Constructs a new MutableLong with the default value of zero.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableLong.MutableLong(long)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Constructs a new MutableLong with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)",
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableLong.MutableLong(java.lang.Number)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Constructs a new MutableLong with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.getValue()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Gets the value as a Long instance.\n     * \n     * @return the value as a Long\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.setValue(long)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.setValue(java.lang.Object)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.increment()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.decrement()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.add(long)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.add(java.lang.Number)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.subtract(long)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.subtract(java.lang.Number)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.intValue()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Returns the value of this MutableLong as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.longValue()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns the value of this MutableLong as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.floatValue()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns the value of this MutableLong as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.doubleValue()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Returns the value of this MutableLong as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.toLong()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Gets this mutable as an instance of Long.\n     *\n     * @return a Long instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.equals(java.lang.Object)",
      "begin_line": 232,
      "end_line": 237,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableLong\u003c/code\u003e object that contains the same \u003ccode\u003elong\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.hashCode()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.compareTo(java.lang.Object)",
      "begin_line": 256,
      "end_line": 260,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableLong\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 46)",
        "(line 258,col 9)-(line 258,col 38)",
        "(line 259,col 9)-(line 259,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.toString()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 37)"
      ]
    }
  ]
}