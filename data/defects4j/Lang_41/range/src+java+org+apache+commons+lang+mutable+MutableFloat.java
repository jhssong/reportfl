{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/mutable/MutableFloat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableFloat",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang.mutable.MutableFloat\u003e",
        "org.apache.commons.lang.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 26,
      "end_line": 315,
      "comment": "\n * A mutable \u003ccode\u003efloat\u003c/code\u003e wrapper.\n * \n * @see Float\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructs a new MutableFloat with the default value of zero.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat(float)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Constructs a new MutableFloat with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat(java.lang.Number)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Constructs a new MutableFloat with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.getValue()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Gets the value as a Float instance.\n     * \n     * @return the value as a Float\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.setValue(float)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.setValue(java.lang.Number)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.increment()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.decrement()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.add(float)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.add(java.lang.Number)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.subtract(float)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.subtract(java.lang.Number)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.intValue()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Returns the value of this MutableFloat as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.longValue()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Returns the value of this MutableFloat as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.floatValue()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Returns the value of this MutableFloat as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.doubleValue()",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * Returns the value of this MutableFloat as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.isNaN()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Checks whether the float value is the special NaN value.\n     * \n     * @return true if NaN\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.isInfinite()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Checks whether the float value is infinite.\n     * \n     * @return true if infinite\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.toFloat()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Gets this mutable as an instance of Float.\n     *\n     * @return a Float instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.equals(java.lang.Object)",
      "begin_line": 276,
      "end_line": 280,
      "comment": "\n     * Compares this object against some other object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eFloat\u003c/code\u003e object that represents a \u003ccode\u003efloat\u003c/code\u003e that has the\n     * identical bit pattern to the bit pattern of the \u003ccode\u003efloat\u003c/code\u003e represented by this object. For this\n     * purpose, two float values are considered to be the same if and only if the method\n     * {@link Float#floatToIntBits(float)}returns the same int value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eFloat\u003c/code\u003e,\u003ccode\u003ef1\u003c/code\u003e and \u003ccode\u003ef2\u003c/code\u003e,\n     * the value of \u003ccode\u003ef1.equals(f2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   f1.floatValue() \u003d\u003d f2.floatValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ef1\u003c/code\u003e and \u003ccode\u003ef2\u003c/code\u003e both represent \u003ccode\u003eFloat.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eFloat.NaN\u003d\u003dFloat.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ef1\u003c/code\u003e represents \u003ccode\u003e+0.0f\u003c/code\u003e while \u003ccode\u003ef2\u003c/code\u003e represents \u003ccode\u003e-0.0f\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e0.0f\u003d\u003d-0.0f\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003c/ul\u003e\n     * This definition allows hashtables to operate properly.\n     * \n     * @param obj\n     *            the object to be compared\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see java.lang.Float#floatToIntBits(float)\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 279,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.hashCode()",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.compareTo(org.apache.commons.lang.mutable.MutableFloat)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 39)",
        "(line 302,col 9)-(line 302,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.toString()",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 37)"
      ]
    }
  ]
}