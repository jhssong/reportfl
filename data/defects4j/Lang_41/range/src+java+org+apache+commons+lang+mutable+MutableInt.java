{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/mutable/MutableInt.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableInt",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang.mutable.MutableInt\u003e",
        "org.apache.commons.lang.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 26,
      "end_line": 277,
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
      "signature": "org.apache.commons.lang.mutable.MutableInt.setValue(java.lang.Number)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *                  the value to set\n     * @throws NullPointerException\n     *                  if the object is null\n     * @throws ClassCastException\n     *                  if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 38)"
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
      "end_line": 185,
      "comment": "\n     * Returns the value of this MutableInt as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.longValue()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Returns the value of this MutableInt as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.floatValue()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Returns the value of this MutableInt as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.doubleValue()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * Returns the value of this MutableInt as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.toInteger()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Gets this mutable as an instance of Integer.\n     *\n     * @return a Integer instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.equals(java.lang.Object)",
      "begin_line": 237,
      "end_line": 243,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument is\n     * not \u003ccode\u003enull\u003c/code\u003e and is an \u003ccode\u003eMutableInt\u003c/code\u003e object that contains the same \u003ccode\u003eint\u003c/code\u003e value\n     * as this object.\n     * \n     * @param obj\n     *                  the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.hashCode()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.compareTo(org.apache.commons.lang.mutable.MutableInt)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other\n     *                  the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 37)",
        "(line 264,col 9)-(line 264,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableInt.toString()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 37)"
      ]
    }
  ]
}