{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/mutable/MutableDouble.java",
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
      "begin_line": 28,
      "end_line": 312,
      "comment": "\n * A mutable \u003ccode\u003edouble\u003c/code\u003e wrapper.\n * \n * @see Double\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructs a new MutableDouble with the default value of zero.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble(double)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)",
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble(java.lang.Number)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.getValue()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Gets the value as a Double instance.\n     * \n     * @return the value as a Double\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.setValue(double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.setValue(java.lang.Object)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.intValue()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Returns the value of this MutableDouble as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.longValue()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Returns the value of this MutableDouble as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.floatValue()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Returns the value of this MutableDouble as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.doubleValue()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Returns the value of this MutableDouble as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.isNaN()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Checks whether the double value is the special NaN value.\n     * \n     * @return true if NaN\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.isInfinite()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Checks whether the double value is infinite.\n     * \n     * @return true if infinite\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.toDouble()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Gets this mutable as an instance of Double.\n     *\n     * @return a Double instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.increment()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.decrement()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.add(double)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.add(java.lang.Number)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.subtract(double)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.subtract(java.lang.Number)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.equals(java.lang.Object)",
      "begin_line": 274,
      "end_line": 277,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eDouble\u003c/code\u003e object that represents a double that has the identical\n     * bit pattern to the bit pattern of the double represented by this object. For this purpose, two\n     * \u003ccode\u003edouble\u003c/code\u003e values are considered to be the same if and only if the method\n     * {@link Double#doubleToLongBits(double)}returns the same long value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eDouble\u003c/code\u003e,\u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e,\n     * the value of \u003ccode\u003ed1.equals(d2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   d1.doubleValue()\u0026nbsp;\u003d\u003d d2.doubleValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e both represent \u003ccode\u003eDouble.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eDouble.NaN\u003d\u003dDouble.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e represents \u003ccode\u003e+0.0\u003c/code\u003e while \u003ccode\u003ed2\u003c/code\u003e represents \u003ccode\u003e-0.0\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e+0.0\u003d\u003d-0.0\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e. This allows hashtables to operate properly.\n     * \u003c/ul\u003e\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 276,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.hashCode()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 51)",
        "(line 286,col 9)-(line 286,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.compareTo(java.lang.Object)",
      "begin_line": 297,
      "end_line": 301,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableDouble\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 50)",
        "(line 299,col 9)-(line 299,col 40)",
        "(line 300,col 9)-(line 300,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.toString()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 37)"
      ]
    }
  ]
}