{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/mutable/MutableFloat.java",
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
      "begin_line": 28,
      "end_line": 313,
      "comment": "\n * A mutable \u003ccode\u003efloat\u003c/code\u003e wrapper.\n * \n * @see Float\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructs a new MutableFloat with the default value of zero.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat(float)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Constructs a new MutableFloat with the specified value.\n     * \n     * @param value\n     *            a value.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)",
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.MutableFloat(java.lang.Number)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Constructs a new MutableFloat with the specified value.\n     * \n     * @param value\n     *            a value.\n     * @throws NullPointerException\n     *             if the object is null\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.getValue()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Gets the value as a Float instance.\n     * \n     * @return the value as a Float\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.setValue(float)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *            the value to set\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.setValue(java.lang.Object)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *            the value to set\n     * @throws NullPointerException\n     *             if the object is null\n     * @throws ClassCastException\n     *             if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.increment()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.decrement()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.add(float)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.add(java.lang.Number)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.subtract(float)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.subtract(java.lang.Number)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.intValue()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Returns the value of this MutableFloat as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.longValue()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Returns the value of this MutableFloat as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.floatValue()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Returns the value of this MutableFloat as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.doubleValue()",
      "begin_line": 211,
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
      "end_line": 279,
      "comment": "\n     * Compares this object against some other object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eFloat\u003c/code\u003e object that represents a \u003ccode\u003efloat\u003c/code\u003e that has the\n     * identical bit pattern to the bit pattern of the \u003ccode\u003efloat\u003c/code\u003e represented by this object. For this\n     * purpose, two float values are considered to be the same if and only if the method\n     * {@link Float#floatToIntBits(float)}returns the same int value when applied to each.\n     * \u003cp\u003e\n     * Note that in most cases, for two instances of class \u003ccode\u003eFloat\u003c/code\u003e,\u003ccode\u003ef1\u003c/code\u003e and \u003ccode\u003ef2\u003c/code\u003e,\n     * the value of \u003ccode\u003ef1.equals(f2)\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e if and only if \u003cblockquote\u003e\n     * \n     * \u003cpre\u003e\n     *   f1.floatValue() \u003d\u003d f2.floatValue()\n     * \u003c/pre\u003e\n     * \n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * also has the value \u003ccode\u003etrue\u003c/code\u003e. However, there are two exceptions:\n     * \u003cul\u003e\n     * \u003cli\u003eIf \u003ccode\u003ef1\u003c/code\u003e and \u003ccode\u003ef2\u003c/code\u003e both represent \u003ccode\u003eFloat.NaN\u003c/code\u003e, then the\n     * \u003ccode\u003eequals\u003c/code\u003e method returns \u003ccode\u003etrue\u003c/code\u003e, even though \u003ccode\u003eFloat.NaN\u003d\u003dFloat.NaN\u003c/code\u003e has\n     * the value \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003cli\u003eIf \u003ccode\u003ef1\u003c/code\u003e represents \u003ccode\u003e+0.0f\u003c/code\u003e while \u003ccode\u003ef2\u003c/code\u003e represents \u003ccode\u003e-0.0f\u003c/code\u003e,\n     * or vice versa, the \u003ccode\u003eequal\u003c/code\u003e test has the value \u003ccode\u003efalse\u003c/code\u003e, even though\n     * \u003ccode\u003e0.0f\u003d\u003d-0.0f\u003c/code\u003e has the value \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003c/ul\u003e\n     * This definition allows hashtables to operate properly.\n     * \n     * @param obj\n     *            the object to be compared\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see java.lang.Float#floatToIntBits(float)\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 278,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.hashCode()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.compareTo(java.lang.Object)",
      "begin_line": 298,
      "end_line": 302,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *            the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 48)",
        "(line 300,col 9)-(line 300,col 39)",
        "(line 301,col 9)-(line 301,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableFloat.toString()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 37)"
      ]
    }
  ]
}