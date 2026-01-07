{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/mutable/MutableDouble.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableDouble",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang3.mutable.MutableDouble\u003e",
        "org.apache.commons.lang3.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 26,
      "end_line": 310,
      "comment": "\n * A mutable \u003ccode\u003edouble\u003c/code\u003e wrapper.\n * \n * @see Double\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.MutableDouble()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructs a new MutableDouble with the default value of zero.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.MutableDouble(double)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)",
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.MutableDouble(java.lang.Number)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.MutableDouble(java.lang.String)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Constructs a new MutableDouble parsing the given string.\n     * \n     * @param value  the string to parse, not null\n     * @throws NumberFormatException if the string cannot be parsed into a double\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)",
        "(line 75,col 9)-(line 75,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.getValue()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Gets the value as a Double instance.\n     * \n     * @return the value as a Double, never null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.setValue(double)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.setValue(java.lang.Number)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.isNaN()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Checks whether the double value is the special NaN value.\n     * \n     * @return true if NaN\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.isInfinite()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Checks whether the double value is infinite.\n     * \n     * @return true if infinite\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.increment()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.decrement()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.add(double)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.add(java.lang.Number)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.subtract(double)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.subtract(java.lang.Number)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.intValue()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * Returns the value of this MutableDouble as an int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.longValue()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * Returns the value of this MutableDouble as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.floatValue()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Returns the value of this MutableDouble as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.doubleValue()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * Returns the value of this MutableDouble as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.toDouble()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Gets this mutable as an instance of Double.\n     *\n     * @return a Double instance containing the value from this mutable, never null\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.equals(java.lang.Object)",
      "begin_line": 270,
      "end_line": 274,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eDouble\u003c/code\u003e object that represents a double that has the identical\n     * bit pattern to the bit pattern of the double represented by this object. For this purpose, two\n     * \u003ccode\u003edouble\u003c/code\u003e values are considered to be the same if and only if the method\n     * {@link Double#doubleToLongBits(double)}returns the same long value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eDouble\u003c/code\u003e,\u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e,\n     * the value of \u003ccode\u003ed1.equals(d2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   d1.doubleValue()\u0026nbsp;\u003d\u003d d2.doubleValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e both represent \u003ccode\u003eDouble.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eDouble.NaN\u003d\u003dDouble.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e represents \u003ccode\u003e+0.0\u003c/code\u003e while \u003ccode\u003ed2\u003c/code\u003e represents \u003ccode\u003e-0.0\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e+0.0\u003d\u003d-0.0\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e. This allows hashtables to operate properly.\n     * \u003c/ul\u003e\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 273,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.hashCode()",
      "begin_line": 281,
      "end_line": 285,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 51)",
        "(line 284,col 9)-(line 284,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.compareTo(org.apache.commons.lang3.mutable.MutableDouble)",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 40)",
        "(line 296,col 9)-(line 296,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.toString()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 37)"
      ]
    }
  ]
}