{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/mutable/MutableShort.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableShort",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable",
        "org.apache.commons.lang.mutable.Mutable"
      ],
      "begin_line": 25,
      "end_line": 276,
      "comment": "\n * A mutable \u003ccode\u003eshort\u003c/code\u003e wrapper.\n * \n * @see Short\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Serialization lock. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableShort.MutableShort()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Constructs a new MutableShort with the default value of zero.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableShort.MutableShort(short)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Constructs a new MutableShort with the specified value.\n     * \n     * @param value\n     *                  a value.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)",
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.mutable.MutableShort.MutableShort(java.lang.Number)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructs a new MutableShort with the specified value.\n     * \n     * @param value\n     *                  a value.\n     * @throws NullPointerException\n     *                  if the object is null\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)",
        "(line 61,col 9)-(line 61,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.getValue()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Gets the value as a Short instance.\n     * \n     * @return the value as a Short\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.setValue(short)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Sets the value.\n     * \n     * @param value\n     *                  the value to set\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.setValue(java.lang.Object)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value\n     *                  the value to set\n     * @throws NullPointerException\n     *                  if the object is null\n     * @throws ClassCastException\n     *                  if the type is not a {@link Number}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.increment()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.decrement()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.add(short)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.add(java.lang.Number)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Adds a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.subtract(short)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.subtract(java.lang.Number)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Subtracts a value.\n     * \n     * @param operand\n     *            the value to add\n     * @throws NullPointerException\n     *             if the object is null\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.shortValue()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Returns the value of this MutableShort as a short.\n     *\n     * @return the numeric value represented by this object after conversion to type short.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.intValue()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Returns the value of this MutableShort as a int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.longValue()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns the value of this MutableShort as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.floatValue()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns the value of this MutableShort as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.doubleValue()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Returns the value of this MutableShort as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.toShort()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Gets this mutable as an instance of Short.\n     *\n     * @return a Short instance containing the value from this mutable\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.equals(java.lang.Object)",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\n     * Compares this object against the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableShort\u003c/code\u003e object that contains the same \u003ccode\u003eshort\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj\n     *                  the object to compare with.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.hashCode()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns a suitable hashcode for this mutable.\n     * \n     * @return a suitable hashcode\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.compareTo(java.lang.Object)",
      "begin_line": 261,
      "end_line": 265,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param obj\n     *                  the mutable to compare to\n     * @return negative if this is less, zero if equal, positive if greater\n     * @throws ClassCastException if the argument is not a MutableShort\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 48)",
        "(line 263,col 9)-(line 263,col 39)",
        "(line 264,col 9)-(line 264,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.mutable.MutableShort.toString()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 37)"
      ]
    }
  ]
}