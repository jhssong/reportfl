{
  "filepath": "/tmp/Math-32b/src/test/java/org/apache/commons/math3/transform/FastFourierTransformerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 564,
      "comment": "\n * Test case for fast Fourier transformer.\n * \u003cp\u003e\n * FFT algorithm is exact, the small tolerance number is used only\n * to account for round-off errors.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SEED"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The common seed of all random number generators used in this test. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformComplexSizeNotAPowerOfTwo()",
      "begin_line": 49,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 26)",
        "(line 52,col 9)-(line 52,col 49)",
        "(line 53,col 9)-(line 53,col 38)",
        "(line 54,col 9)-(line 54,col 41)",
        "(line 55,col 9)-(line 55,col 35)",
        "(line 56,col 9)-(line 56,col 38)",
        "(line 57,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformRealSizeNotAPowerOfTwo()",
      "begin_line": 72,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 26)",
        "(line 75,col 9)-(line 75,col 45)",
        "(line 76,col 9)-(line 76,col 38)",
        "(line 77,col 9)-(line 77,col 41)",
        "(line 78,col 9)-(line 78,col 35)",
        "(line 79,col 9)-(line 79,col 38)",
        "(line 80,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionSizeNotAPowerOfTwo()",
      "begin_line": 95,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 26)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 99,col 38)",
        "(line 100,col 9)-(line 100,col 41)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 38)",
        "(line 103,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionNotStrictlyPositiveNumberOfSamples()",
      "begin_line": 118,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 27)",
        "(line 121,col 9)-(line 121,col 47)",
        "(line 122,col 9)-(line 122,col 38)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionInvalidBounds()",
      "begin_line": 142,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 26)",
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 9)-(line 146,col 38)",
        "(line 147,col 9)-(line 147,col 41)",
        "(line 148,col 9)-(line 148,col 35)",
        "(line 149,col 9)-(line 149,col 38)",
        "(line 150,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.createComplexData(int)",
      "begin_line": 169,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 47)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.createRealData(int)",
      "begin_line": 180,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 47)",
        "(line 182,col 9)-(line 182,col 44)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.dft(org.apache.commons.math3.complex.Complex[], int)",
      "begin_line": 190,
      "end_line": 215,
      "comment": " Naive implementation of DFT, for reference. ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 31)",
        "(line 192,col 9)-(line 192,col 43)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 194,col 9)-(line 194,col 43)",
        "(line 195,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.doTestTransformComplex(int, double, org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 217,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 41)",
        "(line 221,col 9)-(line 221,col 56)",
        "(line 222,col 9)-(line 222,col 49)",
        "(line 223,col 9)-(line 223,col 33)",
        "(line 224,col 9)-(line 224,col 23)",
        "(line 225,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 56)",
        "(line 241,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.doTestTransformReal(int, double, org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 253,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 41)",
        "(line 257,col 9)-(line 257,col 56)",
        "(line 258,col 9)-(line 258,col 45)",
        "(line 259,col 9)-(line 259,col 44)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 33)",
        "(line 264,col 9)-(line 264,col 23)",
        "(line 265,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 56)",
        "(line 281,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.doTestTransformFunction(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int, double, org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 293,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 41)",
        "(line 298,col 9)-(line 298,col 56)",
        "(line 299,col 9)-(line 299,col 43)",
        "(line 300,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 33)",
        "(line 305,col 9)-(line 305,col 23)",
        "(line 306,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 69)",
        "(line 322,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformComplex()",
      "begin_line": 337,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 38)",
        "(line 340,col 9)-(line 340,col 41)",
        "(line 341,col 9)-(line 341,col 35)",
        "(line 342,col 9)-(line 342,col 38)",
        "(line 343,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testStandardTransformReal()",
      "begin_line": 356,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 38)",
        "(line 359,col 9)-(line 359,col 41)",
        "(line 360,col 9)-(line 360,col 35)",
        "(line 361,col 9)-(line 361,col 38)",
        "(line 362,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testStandardTransformFunction()",
      "begin_line": 375,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 48)",
        "(line 378,col 9)-(line 378,col 40)",
        "(line 379,col 9)-(line 379,col 39)",
        "(line 380,col 9)-(line 380,col 38)",
        "(line 381,col 9)-(line 381,col 41)",
        "(line 382,col 9)-(line 382,col 35)",
        "(line 383,col 9)-(line 383,col 38)",
        "(line 384,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testAdHocData()",
      "begin_line": 404,
      "end_line": 449,
      "comment": "\n     * Test of transformer for the ad hoc data taken from Mathematica.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 43)",
        "(line 407,col 9)-(line 407,col 76)",
        "(line 408,col 9)-(line 408,col 25)",
        "(line 408,col 27)-(line 408,col 51)",
        "(line 410,col 9)-(line 410,col 62)",
        "(line 411,col 9)-(line 419,col 63)",
        "(line 421,col 9)-(line 421,col 65)",
        "(line 422,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 427,col 65)",
        "(line 428,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 71)",
        "(line 434,col 9)-(line 434,col 70)",
        "(line 435,col 9)-(line 435,col 25)",
        "(line 437,col 9)-(line 437,col 75)",
        "(line 438,col 9)-(line 438,col 66)",
        "(line 439,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 66)",
        "(line 445,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testSinFunction()",
      "begin_line": 454,
      "end_line": 483,
      "comment": "\n     * Test of transformer for the sine function.\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 49)",
        "(line 457,col 9)-(line 457,col 43)",
        "(line 458,col 9)-(line 458,col 76)",
        "(line 459,col 9)-(line 459,col 25)",
        "(line 459,col 27)-(line 459,col 41)",
        "(line 460,col 9)-(line 460,col 43)",
        "(line 462,col 9)-(line 462,col 18)",
        "(line 462,col 20)-(line 462,col 43)",
        "(line 463,col 9)-(line 463,col 78)",
        "(line 464,col 9)-(line 464,col 65)",
        "(line 465,col 9)-(line 465,col 76)",
        "(line 466,col 9)-(line 466,col 67)",
        "(line 467,col 9)-(line 467,col 75)",
        "(line 468,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 27)",
        "(line 473,col 29)-(line 473,col 46)",
        "(line 474,col 9)-(line 474,col 78)",
        "(line 475,col 9)-(line 475,col 65)",
        "(line 476,col 9)-(line 476,col 71)",
        "(line 477,col 9)-(line 477,col 67)",
        "(line 478,col 9)-(line 478,col 72)",
        "(line 479,col 9)-(line 482,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.test2DData()",
      "begin_line": 489,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 43)",
        "(line 492,col 9)-(line 492,col 76)",
        "(line 494,col 9)-(line 494,col 33)",
        "(line 495,col 9)-(line 498,col 80)",
        "(line 499,col 9)-(line 501,col 44)",
        "(line 502,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 90)",
        "(line 509,col 9)-(line 509,col 92)",
        "(line 511,col 9)-(line 511,col 57)",
        "(line 512,col 9)-(line 512,col 58)",
        "(line 513,col 9)-(line 513,col 63)",
        "(line 514,col 9)-(line 514,col 64)",
        "(line 515,col 9)-(line 515,col 63)",
        "(line 516,col 9)-(line 516,col 64)",
        "(line 518,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.test2DDataUnitary()",
      "begin_line": 530,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 43)",
        "(line 533,col 9)-(line 533,col 75)",
        "(line 534,col 9)-(line 534,col 33)",
        "(line 535,col 9)-(line 538,col 80)",
        "(line 539,col 9)-(line 541,col 44)",
        "(line 542,col 9)-(line 542,col 90)",
        "(line 543,col 9)-(line 543,col 92)",
        "(line 545,col 9)-(line 545,col 57)",
        "(line 546,col 9)-(line 546,col 58)",
        "(line 547,col 9)-(line 547,col 63)",
        "(line 548,col 9)-(line 548,col 64)",
        "(line 549,col 9)-(line 549,col 63)",
        "(line 550,col 9)-(line 550,col 64)",
        "(line 552,col 9)-(line 561,col 9)"
      ]
    }
  ]
}