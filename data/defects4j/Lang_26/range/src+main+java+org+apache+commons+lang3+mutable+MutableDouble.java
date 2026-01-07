{
  "filepath": "/tmp/Lang-26b/src/main/java/org/apache/commons/lang3/mutable/MutableDouble.java",
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
      "begin_line": 27,
      "end_line": 311,
      "comment": "\n * A mutable \u003ccode\u003edouble\u003c/code\u003e wrapper.\n * \n * @see Double\n * @since 2.1\n * @author Apache Software Foundation\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.MutableDouble()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructs a new MutableDouble with the default value of zero.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.MutableDouble(double)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.MutableDouble(java.lang.Number)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructs a new MutableDouble with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 64,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.MutableDouble(java.lang.String)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Constructs a new MutableDouble parsing the given string.\n     * \n     * @param value  the string to parse, not null\n     * @throws NumberFormatException if the string cannot be parsed into a double\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)",
        "(line 76,col 9)-(line 76,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.getValue()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Gets the value as a Double instance.\n     * \n     * @return the value as a Double, never null\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.setValue(double)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.setValue(java.lang.Number)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.isNaN()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Checks whether the double value is the special NaN value.\n     * \n     * @return true if NaN\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.isInfinite()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Checks whether the double value is infinite.\n     * \n     * @return true if infinite\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.increment()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.decrement()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.add(double)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.add(java.lang.Number)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.subtract(double)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.subtract(java.lang.Number)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.intValue()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Returns the value of this MutableDouble as an int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.longValue()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * Returns the value of this MutableDouble as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.floatValue()",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * Returns the value of this MutableDouble as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.doubleValue()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Returns the value of this MutableDouble as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.toDouble()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Gets this mutable as an instance of Double.\n     *\n     * @return a Double instance containing the value from this mutable, never null\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.equals(java.lang.Object)",
      "begin_line": 271,
      "end_line": 275,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eDouble\u003c/code\u003e object that represents a double that has the identical\n     * bit pattern to the bit pattern of the double represented by this object. For this purpose, two\n     * \u003ccode\u003edouble\u003c/code\u003e values are considered to be the same if and only if the method\n     * {@link Double#doubleToLongBits(double)}returns the same long value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eDouble\u003c/code\u003e,\u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e,\n     * the value of \u003ccode\u003ed1.equals(d2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   d1.doubleValue()\u0026nbsp;\u003d\u003d d2.doubleValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e and \u003ccode\u003ed2\u003c/code\u003e both represent \u003ccode\u003eDouble.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eDouble.NaN\u003d\u003dDouble.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ed1\u003c/code\u003e represents \u003ccode\u003e+0.0\u003c/code\u003e while \u003ccode\u003ed2\u003c/code\u003e represents \u003ccode\u003e-0.0\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e+0.0\u003d\u003d-0.0\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e. This allows hashtables to operate properly.\n     * \u003c/ul\u003e\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 274,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.hashCode()",
      "begin_line": 282,
      "end_line": 286,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 51)",
        "(line 285,col 9)-(line 285,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.compareTo(org.apache.commons.lang3.mutable.MutableDouble)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 40)",
        "(line 297,col 9)-(line 297,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableDouble.toString()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 37)"
      ]
    }
  ]
}