{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/mutable/MutableInt.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableInt",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable",
        "org.apache.commons.lang.mutable.Mutable"
      ],
      "begin_line": 26,
      "end_line": 272,
      "comment": "\n * A mutable \u003ccode\u003eint\u003c/code\u003e wrapper.\n * \n * @see Integer\n * @since 2.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.mutable.MutableInt.MutableInt()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructs a new MutableInt with the default value of zero.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableInt.MutableInt(int)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Constructs a new MutableInt with the specified value.\n     * \n     * @param value\n     *                  a value.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableInt.MutableInt(java.lang.Number)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Constructs a new MutableInt with the specified value.\n     * \n     * @param value\n     *                  a value.\n     * @throws NullPointerException\n     *                  if the object is null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.getValue()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Gets the value as a Integer instance.\n     * \n     * @return the value as a Integer\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.setValue(int)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *                  the value to set\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.setValue(java.lang.Object)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *                  the value to set\n     * @throws NullPointerException\n     *                  if the object is null\n     * @throws ClassCastException\n     *                  if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.increment()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.decrement()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.add(int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.add(java.lang.Number)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.subtract(int)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.subtract(java.lang.Number)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.intValue()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Returns the value of this MutableInt as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.longValue()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Returns the value of this MutableInt as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.floatValue()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Returns the value of this MutableInt as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.doubleValue()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Returns the value of this MutableInt as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.toInteger()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Gets this mutable as an instance of Integer.\n     *\n     * @return a Integer instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.equals(java.lang.Object)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableInt\u003c/code\u003e object that contains the same \u003ccode\u003eint\u003c/code\u003e value\n     * as this object.\n     * \n     * @param obj\n     *                  the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.hashCode()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.compareTo(java.lang.Object)",
      "begin_line": 257,
      "end_line": 261,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *                  the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableInt\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 44)",
        "(line 259,col 9)-(line 259,col 37)",
        "(line 260,col 9)-(line 260,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.toString()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 37)"
      ]
    }
  ]
}