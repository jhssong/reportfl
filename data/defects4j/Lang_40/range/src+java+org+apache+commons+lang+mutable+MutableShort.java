{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/mutable/MutableShort.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableShort",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang.mutable.MutableShort\u003e",
        "org.apache.commons.lang.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 26,
      "end_line": 285,
      "comment": "\n * A mutable \u003ccode\u003eshort\u003c/code\u003e wrapper.\n * \n * @see Short\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.mutable.MutableShort.MutableShort()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructs a new MutableShort with the default value of zero.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableShort.MutableShort(short)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Constructs a new MutableShort with the specified value.\n     * \n     * @param value\n     *                  a value.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableShort.MutableShort(java.lang.Number)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Constructs a new MutableShort with the specified value.\n     * \n     * @param value\n     *                  a value.\n     * @throws NullPointerException\n     *                  if the object is null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.getValue()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Gets the value as a Short instance.\n     * \n     * @return the value as a Short\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.setValue(short)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *                  the value to set\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.setValue(java.lang.Number)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *                  the value to set\n     * @throws NullPointerException\n     *                  if the object is null\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.increment()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.decrement()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.add(short)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.add(java.lang.Number)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.subtract(short)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.subtract(java.lang.Number)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.shortValue()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Returns the value of this MutableShort as a short.\n     *\n     * @return the numeric value represented by this object after conversion to type short.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.intValue()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Returns the value of this MutableShort as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.longValue()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Returns the value of this MutableShort as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.floatValue()",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * Returns the value of this MutableShort as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.doubleValue()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Returns the value of this MutableShort as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.toShort()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Gets this mutable as an instance of Short.\n     *\n     * @return a Short instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.equals(java.lang.Object)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableShort\u003c/code\u003e object that contains the same \u003ccode\u003eshort\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *                  the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.hashCode()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.compareTo(org.apache.commons.lang.mutable.MutableShort)",
      "begin_line": 270,
      "end_line": 273,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other\n     *                  the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.toString()",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 37)"
      ]
    }
  ]
}