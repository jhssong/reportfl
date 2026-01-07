{
  "filepath": "/tmp/Math-37b/src/test/java/org/apache/commons/math/transform/FastSineTransformerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformerTest",
      "is_interface": false,
      "parent_types": [
        "RealTransformerAbstractTest"
      ],
      "begin_line": 41,
      "end_line": 286,
      "comment": "\n * Test case for fast sine transformer.\n * \u003cp\u003e\n * FST algorithm is exact, the small tolerance number is used only\n * to account for round-off errors.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "standard"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidDataSize"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "relativeTolerance"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validDataSize"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.FastSineTransformerTest(boolean)",
      "begin_line": 52,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 33)",
        "(line 54,col 9)-(line 56,col 10)",
        "(line 57,col 9)-(line 59,col 10)",
        "(line 60,col 9)-(line 62,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.data()",
      "begin_line": 71,
      "end_line": 81,
      "comment": "\n     * Returns an array containing {@code true, false} in order to check both\n     * standard and orthogonal DSTs.\n     *\n     * @return an array of parameters for this parameterized test\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 79,col 10)",
        "(line 80,col 9)-(line 80,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.createRealData(int)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Overriding the default implementation allows to ensure that the first\n     * element of the data set is zero.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 54)",
        "(line 92,col 9)-(line 92,col 22)",
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.createRealTransformer()",
      "begin_line": 96,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getInvalidDataSize(int)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getNumberOfInvalidDataSizes()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getNumberOfValidDataSizes()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getRelativeTolerance(int)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getValidDataSize(int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getValidFunction()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getValidLowerBound()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getValidUpperBound()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.transform(double[], boolean)",
      "begin_line": 145,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 31)",
        "(line 148,col 9)-(line 148,col 41)",
        "(line 149,col 9)-(line 149,col 47)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 23)",
        "(line 161,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 40)",
        "(line 167,col 9)-(line 167,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testTransformRealFirstElementNotZero()",
      "begin_line": 173,
      "end_line": 180,
      "comment": "\n     * Additional tests.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 10)",
        "(line 178,col 9)-(line 178,col 68)",
        "(line 179,col 9)-(line 179,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testInverseTransformRealFirstElementNotZero()",
      "begin_line": 182,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 10)",
        "(line 187,col 9)-(line 187,col 68)",
        "(line 188,col 9)-(line 188,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testAdHocData()",
      "begin_line": 198,
      "end_line": 230,
      "comment": "\n     * Test of transformer for the ad hoc data.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 71)",
        "(line 201,col 9)-(line 201,col 43)",
        "(line 203,col 9)-(line 203,col 64)",
        "(line 204,col 9)-(line 206,col 61)",
        "(line 208,col 9)-(line 208,col 42)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 49)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 68)",
        "(line 219,col 9)-(line 219,col 61)",
        "(line 221,col 9)-(line 221,col 42)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 49)",
        "(line 227,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testSinFunction()",
      "begin_line": 235,
      "end_line": 254,
      "comment": "\n     * Test of transformer for the sine function.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 49)",
        "(line 238,col 9)-(line 238,col 71)",
        "(line 239,col 9)-(line 239,col 53)",
        "(line 239,col 55)-(line 239,col 69)",
        "(line 241,col 9)-(line 241,col 18)",
        "(line 241,col 20)-(line 241,col 43)",
        "(line 242,col 9)-(line 242,col 55)",
        "(line 243,col 9)-(line 243,col 58)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 27)",
        "(line 248,col 29)-(line 248,col 46)",
        "(line 249,col 9)-(line 249,col 55)",
        "(line 250,col 9)-(line 250,col 61)",
        "(line 251,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testParameters()",
      "begin_line": 259,
      "end_line": 285,
      "comment": "\n     * Test of parameters for the transformer.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 49)",
        "(line 262,col 9)-(line 262,col 71)",
        "(line 264,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 284,col 9)"
      ]
    }
  ]
}