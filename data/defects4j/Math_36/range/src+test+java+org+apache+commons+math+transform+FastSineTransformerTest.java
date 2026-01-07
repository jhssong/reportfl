{
  "filepath": "/tmp/Math-36b/src/test/java/org/apache/commons/math/transform/FastSineTransformerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformerTest",
      "is_interface": false,
      "parent_types": [
        "RealTransformerAbstractTest"
      ],
      "begin_line": 42,
      "end_line": 292,
      "comment": "\n * Test case for fast sine transformer.\n * \u003cp\u003e\n * FST algorithm is exact, the small tolerance number is used only\n * to account for round-off errors.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "standard"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidDataSize"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "relativeTolerance"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validDataSize"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.FastSineTransformerTest(boolean)",
      "begin_line": 53,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 33)",
        "(line 55,col 9)-(line 57,col 10)",
        "(line 58,col 9)-(line 60,col 10)",
        "(line 61,col 9)-(line 63,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.data()",
      "begin_line": 72,
      "end_line": 82,
      "comment": "\n     * Returns an array containing {@code true, false} in order to check both\n     * standard and orthogonal DSTs.\n     *\n     * @return an array of parameters for this parameterized test\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 80,col 10)",
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.createRealData(int)",
      "begin_line": 90,
      "end_line": 95,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Overriding the default implementation allows to ensure that the first\n     * element of the data set is zero.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 54)",
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.createRealTransformer()",
      "begin_line": 97,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getInvalidDataSize(int)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getNumberOfInvalidDataSizes()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getNumberOfValidDataSizes()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getRelativeTolerance(int)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getValidDataSize(int)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getValidFunction()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getValidLowerBound()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.getValidUpperBound()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.transform(double[], org.apache.commons.math.transform.TransformType)",
      "begin_line": 146,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 31)",
        "(line 149,col 9)-(line 149,col 41)",
        "(line 150,col 9)-(line 150,col 47)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 23)",
        "(line 162,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 40)",
        "(line 174,col 9)-(line 174,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testTransformRealFirstElementNotZero()",
      "begin_line": 180,
      "end_line": 195,
      "comment": "\n     * Additional tests.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 60)",
        "(line 183,col 9)-(line 185,col 10)",
        "(line 186,col 9)-(line 186,col 68)",
        "(line 187,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testAdHocData()",
      "begin_line": 204,
      "end_line": 236,
      "comment": "\n     * Test of transformer for the ad hoc data.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 99)",
        "(line 207,col 9)-(line 207,col 43)",
        "(line 209,col 9)-(line 209,col 64)",
        "(line 210,col 9)-(line 212,col 61)",
        "(line 214,col 9)-(line 214,col 65)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 65)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 68)",
        "(line 225,col 9)-(line 225,col 81)",
        "(line 227,col 9)-(line 227,col 65)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 65)",
        "(line 233,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testSinFunction()",
      "begin_line": 241,
      "end_line": 260,
      "comment": "\n     * Test of transformer for the sine function.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 49)",
        "(line 244,col 9)-(line 244,col 99)",
        "(line 245,col 9)-(line 245,col 53)",
        "(line 245,col 55)-(line 245,col 69)",
        "(line 247,col 9)-(line 247,col 18)",
        "(line 247,col 20)-(line 247,col 43)",
        "(line 248,col 9)-(line 248,col 78)",
        "(line 249,col 9)-(line 249,col 58)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 27)",
        "(line 254,col 29)-(line 254,col 46)",
        "(line 255,col 9)-(line 255,col 78)",
        "(line 256,col 9)-(line 256,col 61)",
        "(line 257,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformerTest.testParameters()",
      "begin_line": 265,
      "end_line": 291,
      "comment": "\n     * Test of parameters for the transformer.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 49)",
        "(line 268,col 9)-(line 268,col 99)",
        "(line 270,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 290,col 9)"
      ]
    }
  ]
}