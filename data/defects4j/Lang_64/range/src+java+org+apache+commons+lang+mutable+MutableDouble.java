{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/mutable/MutableDouble.java",
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
      "end_line": 311,
      "comment": "\n * A mutable \u003ccode\u003edouble\u003c/code\u003e wrapper.\n * \n * @see Double\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructs a new MutableDouble with the default value of zero.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble(double)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.MutableDouble(java.lang.Number)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 67,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.getValue()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Gets the value as a Double instance.\n     * \n     * @return the value as a Double\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.setValue(double)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.setValue(java.lang.Object)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.intValue()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Returns the value of this MutableDouble as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.longValue()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Returns the value of this MutableDouble as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.floatValue()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Returns the value of this MutableDouble as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.doubleValue()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns the value of this MutableDouble as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.isNaN()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Checks whether the double value is the special NaN value.\n     * \n     * @return true if NaN\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.isInfinite()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Checks whether the double value is infinite.\n     * \n     * @return true if infinite\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.toDouble()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Gets this mutable as an instance of Double.\n     *\n     * @return a Double instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.increment()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.decrement()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.add(double)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.add(java.lang.Number)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.subtract(double)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.subtract(java.lang.Number)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.equals(java.lang.Object)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eDouble\u003c/code\u003e object that represents a double that has the identical\n     * bit pattern to the bit pattern of the double represented by this object. For this purpose, two\n     * \u003ccode\u003edouble\u003c/code\u003e values are considered to be the same if and only if the method\n     * {@link Double#doubleToLongBits(double)}returns the same long value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eDouble\u003c/code\u003e,\u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e,\n     * the value of \u003ccode\u003ed1.equals(d2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   d1.doubleValue()\u0026nbsp;\u003d\u003d d2.doubleValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e both represent \u003ccode\u003eDouble.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eDouble.NaN\u003d\u003dDouble.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e represents \u003ccode\u003e+0.0\u003c/code\u003e while \u003ccode\u003ed2\u003c/code\u003e represents \u003ccode\u003e-0.0\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e+0.0\u003d\u003d-0.0\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e. This allows hashtables to operate properly.\n     * \u003c/ul\u003e\n     * \n     * @param obj\n     *            the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 275,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.hashCode()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 51)",
        "(line 285,col 9)-(line 285,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.compareTo(java.lang.Object)",
      "begin_line": 296,
      "end_line": 300,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableDouble\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 50)",
        "(line 298,col 9)-(line 298,col 40)",
        "(line 299,col 9)-(line 299,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableDouble.toString()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 37)"
      ]
    }
  ]
}