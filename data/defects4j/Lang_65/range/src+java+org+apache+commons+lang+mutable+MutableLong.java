{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/mutable/MutableLong.java",
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
      "end_line": 267,
      "comment": "\n * A mutable \u003ccode\u003elong\u003c/code\u003e wrapper.\n * \n * @see Long\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.mutable.MutableLong.MutableLong()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Constructs a new MutableLong with the default value of zero.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableLong.MutableLong(long)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Constructs a new MutableLong with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)",
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableLong.MutableLong(java.lang.Number)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructs a new MutableLong with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)",
        "(line 61,col 9)-(line 61,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.getValue()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Gets the value as a Long instance.\n     * \n     * @return the value as a Long\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.setValue(long)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.setValue(java.lang.Object)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.increment()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.decrement()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.add(long)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.add(java.lang.Number)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.subtract(long)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.subtract(java.lang.Number)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.intValue()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Returns the value of this MutableLong as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.longValue()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Returns the value of this MutableLong as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.floatValue()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns the value of this MutableLong as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.doubleValue()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns the value of this MutableLong as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.toLong()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Gets this mutable as an instance of Long.\n     *\n     * @return a Long instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.equals(java.lang.Object)",
      "begin_line": 228,
      "end_line": 233,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableLong\u003c/code\u003e object that contains the same \u003ccode\u003elong\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.hashCode()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.compareTo(java.lang.Object)",
      "begin_line": 252,
      "end_line": 256,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableLong\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 46)",
        "(line 254,col 9)-(line 254,col 38)",
        "(line 255,col 9)-(line 255,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableLong.toString()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 37)"
      ]
    }
  ]
}