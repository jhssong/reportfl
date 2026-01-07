{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/mutable/MutableDouble.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableDouble",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable",
        "org.apache.commons.lang.mutable.Mutable"
      ],
      "begin_line": 27,
      "end_line": 307,
      "comment": "\n * A mutable \u003ccode\u003edouble\u003c/code\u003e wrapper.\n * \n * @see Double\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serialization lock. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructs a new MutableDouble with the default value of zero.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble(double)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)",
        "(line 50,col 9)-(line 50,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble(java.lang.Number)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.getValue()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Gets the value as a Double instance.\n     * \n     * @return the value as a Double\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.setValue(double)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.setValue(java.lang.Object)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.intValue()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Returns the value of this MutableDouble as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.longValue()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the value of this MutableDouble as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.floatValue()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns the value of this MutableDouble as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.doubleValue()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns the value of this MutableDouble as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.isNaN()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Checks whether the double value is the special NaN value.\n     * \n     * @return true if NaN\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.isInfinite()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Checks whether the double value is infinite.\n     * \n     * @return true if infinite\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.toDouble()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Gets this mutable as an instance of Double.\n     *\n     * @return a Double instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.increment()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.decrement()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.add(double)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.add(java.lang.Number)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.subtract(double)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.subtract(java.lang.Number)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.equals(java.lang.Object)",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eDouble\u003c/code\u003e object that represents a double that has the identical\n     * bit pattern to the bit pattern of the double represented by this object. For this purpose, two\n     * \u003ccode\u003edouble\u003c/code\u003e values are considered to be the same if and only if the method\n     * {@link Double#doubleToLongBits(double)}returns the same long value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eDouble\u003c/code\u003e,\u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e,\n     * the value of \u003ccode\u003ed1.equals(d2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   d1.doubleValue()\u0026nbsp;\u003d\u003d d2.doubleValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e both represent \u003ccode\u003eDouble.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eDouble.NaN\u003d\u003dDouble.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e represents \u003ccode\u003e+0.0\u003c/code\u003e while \u003ccode\u003ed2\u003c/code\u003e represents \u003ccode\u003e-0.0\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e+0.0\u003d\u003d-0.0\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e. This allows hashtables to operate properly.\n     * \u003c/ul\u003e\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 271,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.hashCode()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 51)",
        "(line 281,col 9)-(line 281,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.compareTo(java.lang.Object)",
      "begin_line": 292,
      "end_line": 296,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableDouble\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 50)",
        "(line 294,col 9)-(line 294,col 40)",
        "(line 295,col 9)-(line 295,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.toString()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 37)"
      ]
    }
  ]
}