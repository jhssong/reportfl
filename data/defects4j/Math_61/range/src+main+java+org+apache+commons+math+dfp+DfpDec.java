{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/dfp/DfpDec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DfpDec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.dfp.Dfp"
      ],
      "begin_line": 27,
      "end_line": 359,
      "comment": " Subclass of {@link Dfp} which hides the radix-10000 artifacts of the superclass.\n * This should give outward appearances of being a decimal number with DIGITS*4-3\n * decimal digits. This class can be subclassed to appear to be an arbitrary number\n * of decimal digits less than DIGITS*4-3.\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpDec.DfpDec(org.apache.commons.math.dfp.DfpField)",
      "begin_line": 32,
      "end_line": 34,
      "comment": " Makes an instance with a value of zero.\n     * @param factory factory linked to this instance\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpDec.DfpDec(org.apache.commons.math.dfp.DfpField, byte)",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Create an instance from a byte value.\n     * @param factory factory linked to this instance\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpDec.DfpDec(org.apache.commons.math.dfp.DfpField, int)",
      "begin_line": 48,
      "end_line": 50,
      "comment": " Create an instance from an int value.\n     * @param factory factory linked to this instance\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpDec.DfpDec(org.apache.commons.math.dfp.DfpField, long)",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Create an instance from a long value.\n     * @param factory factory linked to this instance\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpDec.DfpDec(org.apache.commons.math.dfp.DfpField, double)",
      "begin_line": 64,
      "end_line": 67,
      "comment": " Create an instance from a double value.\n     * @param factory factory linked to this instance\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 26)",
        "(line 66,col 9)-(line 66,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpDec.DfpDec(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 72,
      "end_line": 75,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 17)",
        "(line 74,col 9)-(line 74,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpDec.DfpDec(org.apache.commons.math.dfp.DfpField, java.lang.String)",
      "begin_line": 81,
      "end_line": 84,
      "comment": " Create an instance from a String representation.\n     * @param factory factory linked to this instance\n     * @param s string representation of the instance\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 26)",
        "(line 83,col 9)-(line 83,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.DfpDec.DfpDec(org.apache.commons.math.dfp.DfpField, byte, byte)",
      "begin_line": 92,
      "end_line": 94,
      "comment": " Creates an instance with a non-finite value.\n     * @param factory factory linked to this instance\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.newInstance()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.newInstance(byte)",
      "begin_line": 102,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.newInstance(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.newInstance(long)",
      "begin_line": 112,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.newInstance(double)",
      "begin_line": 117,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.newInstance(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 122,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.newInstance(java.lang.String)",
      "begin_line": 137,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.newInstance(byte, byte)",
      "begin_line": 142,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.getDecimalDigits()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " Get the number of decimal digits this class is going to represent.\n     * Default implementation returns {@link #getRadixDigits()}*4-3. Subclasses can\n     * override this to return something less.\n     * @return number of decimal digits this class is going to represent\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.round(int)",
      "begin_line": 156,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 38)",
        "(line 159,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 41)",
        "(line 165,col 9)-(line 165,col 32)",
        "(line 166,col 9)-(line 169,col 9)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 49)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 176,col 9)-(line 176,col 25)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 34)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 27)",
        "(line 188,col 9)-(line 188,col 20)",
        "(line 189,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 54)",
        "(line 206,col 9)-(line 206,col 26)",
        "(line 207,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 259,col 9)",
        "(line 262,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.DfpDec.nextAfter(org.apache.commons.math.dfp.Dfp)",
      "begin_line": 283,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 44)",
        "(line 288,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 27)",
        "(line 296,col 9)-(line 296,col 19)",
        "(line 297,col 9)-(line 297,col 16)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 22)"
      ]
    }
  ]
}