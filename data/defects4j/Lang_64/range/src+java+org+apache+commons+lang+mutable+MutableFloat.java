{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/mutable/MutableFloat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableFloat",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable",
        "org.apache.commons.lang.mutable.Mutable"
      ],
      "begin_line": 27,
      "end_line": 312,
      "comment": "\n * A mutable \u003ccode\u003efloat\u003c/code\u003e wrapper.\n * \n * @see Float\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructs a new MutableFloat with the default value of zero.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat(float)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Constructs a new MutableFloat with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat(java.lang.Number)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Constructs a new MutableFloat with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 67,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.getValue()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Gets the value as a Float instance.\n     * \n     * @return the value as a Float\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.setValue(float)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.setValue(java.lang.Object)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.increment()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.decrement()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.add(float)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.add(java.lang.Number)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.subtract(float)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.subtract(java.lang.Number)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.intValue()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Returns the value of this MutableFloat as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.longValue()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Returns the value of this MutableFloat as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.floatValue()",
      "begin_line": 201,
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
      "end_line": 212,
      "comment": "\n     * Returns the value of this MutableFloat as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.isNaN()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Checks whether the float value is the special NaN value.\n     * \n     * @return true if NaN\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.isInfinite()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Checks whether the float value is infinite.\n     * \n     * @return true if infinite\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.toFloat()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Gets this mutable as an instance of Float.\n     *\n     * @return a Float instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.equals(java.lang.Object)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Compares this object against some other object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eFloat\u003c/code\u003e object that represents a \u003ccode\u003efloat\u003c/code\u003e that has the\n     * identical bit pattern to the bit pattern of the \u003ccode\u003efloat\u003c/code\u003e represented by this object. For this\n     * purpose, two float values are considered to be the same if and only if the method\n     * {@link Float#floatToIntBits(float)}returns the same int value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eFloat\u003c/code\u003e,\u003ccode\u003ef1\u003c/code\u003e and \u003ccode\u003ef2\u003c/code\u003e,\n     * the value of \u003ccode\u003ef1.equals(f2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   f1.floatValue() \u003d\u003d f2.floatValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ef1\u003c/code\u003e and \u003ccode\u003ef2\u003c/code\u003e both represent \u003ccode\u003eFloat.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eFloat.NaN\u003d\u003dFloat.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ef1\u003c/code\u003e represents \u003ccode\u003e+0.0f\u003c/code\u003e while \u003ccode\u003ef2\u003c/code\u003e represents \u003ccode\u003e-0.0f\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e0.0f\u003d\u003d-0.0f\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003c/ul\u003e\n     * This definition allows hashtables to operate properly.\n     * \n     * @param obj\n     *            the object to be compared\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see java.lang.Float#floatToIntBits(float)\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 277,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.hashCode()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.compareTo(java.lang.Object)",
      "begin_line": 297,
      "end_line": 301,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 48)",
        "(line 299,col 9)-(line 299,col 39)",
        "(line 300,col 9)-(line 300,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.toString()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 37)"
      ]
    }
  ]
}