{
  "filepath": "/tmp/Lang-15b/src/main/java/org/apache/commons/lang3/mutable/MutableFloat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableFloat",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang3.mutable.MutableFloat\u003e",
        "org.apache.commons.lang3.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 28,
      "end_line": 313,
      "comment": "\n * A mutable \u003ccode\u003efloat\u003c/code\u003e wrapper.\n * \u003cp\u003e\n * Note that as MutableFloat does not extend Float, it is not treated by String.format as a Float parameter. \n * \n * @see Float\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.MutableFloat()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructs a new MutableFloat with the default value of zero.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.MutableFloat(float)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Constructs a new MutableFloat with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.MutableFloat(java.lang.Number)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Constructs a new MutableFloat with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.MutableFloat(java.lang.String)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Constructs a new MutableFloat parsing the given string.\n     * \n     * @param value  the string to parse, not null\n     * @throws NumberFormatException if the string cannot be parsed into a float\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)",
        "(line 77,col 9)-(line 77,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.getValue()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Gets the value as a Float instance.\n     * \n     * @return the value as a Float, never null\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.setValue(float)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.setValue(java.lang.Number)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.isNaN()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Checks whether the float value is the special NaN value.\n     * \n     * @return true if NaN\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.isInfinite()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Checks whether the float value is infinite.\n     * \n     * @return true if infinite\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.increment()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.decrement()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.add(float)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.add(java.lang.Number)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.subtract(float)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.subtract(java.lang.Number)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.intValue()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * Returns the value of this MutableFloat as an int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.longValue()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Returns the value of this MutableFloat as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.floatValue()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * Returns the value of this MutableFloat as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.doubleValue()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * Returns the value of this MutableFloat as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.toFloat()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Gets this mutable as an instance of Float.\n     *\n     * @return a Float instance containing the value from this mutable, never null\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.equals(java.lang.Object)",
      "begin_line": 274,
      "end_line": 278,
      "comment": "\n     * Compares this object against some other object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eFloat\u003c/code\u003e object that represents a \u003ccode\u003efloat\u003c/code\u003e that has the\n     * identical bit pattern to the bit pattern of the \u003ccode\u003efloat\u003c/code\u003e represented by this object. For this\n     * purpose, two float values are considered to be the same if and only if the method\n     * {@link Float#floatToIntBits(float)}returns the same int value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eFloat\u003c/code\u003e,\u003ccode\u003ef1\u003c/code\u003e and \u003ccode\u003ef2\u003c/code\u003e,\n     * the value of \u003ccode\u003ef1.equals(f2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   f1.floatValue() \u003d\u003d f2.floatValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ef1\u003c/code\u003e and \u003ccode\u003ef2\u003c/code\u003e both represent \u003ccode\u003eFloat.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eFloat.NaN\u003d\u003dFloat.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ef1\u003c/code\u003e represents \u003ccode\u003e+0.0f\u003c/code\u003e while \u003ccode\u003ef2\u003c/code\u003e represents \u003ccode\u003e-0.0f\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e0.0f\u003d\u003d-0.0f\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003c/ul\u003e\n     * This definition allows hashtables to operate properly.\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see java.lang.Float#floatToIntBits(float)\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 277,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.hashCode()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.compareTo(org.apache.commons.lang3.mutable.MutableFloat)",
      "begin_line": 297,
      "end_line": 300,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 39)",
        "(line 299,col 9)-(line 299,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableFloat.toString()",
      "begin_line": 308,
      "end_line": 311,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 37)"
      ]
    }
  ]
}