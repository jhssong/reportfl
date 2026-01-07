{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/transform/FastFourierTransformerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 563,
      "comment": "\n * Test case for fast Fourier transformer.\n * \u003cp\u003e\n * FFT algorithm is exact, the small tolerance number is used only\n * to account for round-off errors.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SEED"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The common seed of all random number generators used in this test. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformComplexSizeNotAPowerOfTwo()",
      "begin_line": 48,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 26)",
        "(line 51,col 9)-(line 51,col 49)",
        "(line 52,col 9)-(line 52,col 38)",
        "(line 53,col 9)-(line 53,col 41)",
        "(line 54,col 9)-(line 54,col 35)",
        "(line 55,col 9)-(line 55,col 38)",
        "(line 56,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformRealSizeNotAPowerOfTwo()",
      "begin_line": 71,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 26)",
        "(line 74,col 9)-(line 74,col 45)",
        "(line 75,col 9)-(line 75,col 38)",
        "(line 76,col 9)-(line 76,col 41)",
        "(line 77,col 9)-(line 77,col 35)",
        "(line 78,col 9)-(line 78,col 38)",
        "(line 79,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionSizeNotAPowerOfTwo()",
      "begin_line": 94,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 26)",
        "(line 97,col 9)-(line 97,col 47)",
        "(line 98,col 9)-(line 98,col 38)",
        "(line 99,col 9)-(line 99,col 41)",
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionNotStrictlyPositiveNumberOfSamples()",
      "begin_line": 117,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 27)",
        "(line 120,col 9)-(line 120,col 47)",
        "(line 121,col 9)-(line 121,col 38)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformFunctionInvalidBounds()",
      "begin_line": 141,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 26)",
        "(line 144,col 9)-(line 144,col 47)",
        "(line 145,col 9)-(line 145,col 38)",
        "(line 146,col 9)-(line 146,col 41)",
        "(line 147,col 9)-(line 147,col 35)",
        "(line 148,col 9)-(line 148,col 38)",
        "(line 149,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.createComplexData(int)",
      "begin_line": 168,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 47)",
        "(line 170,col 9)-(line 170,col 46)",
        "(line 171,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.createRealData(int)",
      "begin_line": 179,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 47)",
        "(line 181,col 9)-(line 181,col 44)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.dft(org.apache.commons.math3.complex.Complex[], int)",
      "begin_line": 189,
      "end_line": 214,
      "comment": " Naive implementation of DFT, for reference. ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 31)",
        "(line 191,col 9)-(line 191,col 43)",
        "(line 192,col 9)-(line 192,col 43)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 194,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.doTestTransformComplex(int, double, org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 216,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 41)",
        "(line 220,col 9)-(line 220,col 56)",
        "(line 221,col 9)-(line 221,col 49)",
        "(line 222,col 9)-(line 222,col 33)",
        "(line 223,col 9)-(line 223,col 23)",
        "(line 224,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 56)",
        "(line 240,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.doTestTransformReal(int, double, org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 252,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 41)",
        "(line 256,col 9)-(line 256,col 56)",
        "(line 257,col 9)-(line 257,col 45)",
        "(line 258,col 9)-(line 258,col 44)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 33)",
        "(line 263,col 9)-(line 263,col 23)",
        "(line 264,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 56)",
        "(line 280,col 9)-(line 289,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.doTestTransformFunction(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int, double, org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 292,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 41)",
        "(line 297,col 9)-(line 297,col 56)",
        "(line 298,col 9)-(line 298,col 43)",
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 33)",
        "(line 304,col 9)-(line 304,col 23)",
        "(line 305,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 69)",
        "(line 321,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testTransformComplex()",
      "begin_line": 336,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 38)",
        "(line 339,col 9)-(line 339,col 41)",
        "(line 340,col 9)-(line 340,col 35)",
        "(line 341,col 9)-(line 341,col 38)",
        "(line 342,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testStandardTransformReal()",
      "begin_line": 355,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 38)",
        "(line 358,col 9)-(line 358,col 41)",
        "(line 359,col 9)-(line 359,col 35)",
        "(line 360,col 9)-(line 360,col 38)",
        "(line 361,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testStandardTransformFunction()",
      "begin_line": 374,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 48)",
        "(line 377,col 9)-(line 377,col 40)",
        "(line 378,col 9)-(line 378,col 39)",
        "(line 379,col 9)-(line 379,col 38)",
        "(line 380,col 9)-(line 380,col 41)",
        "(line 381,col 9)-(line 381,col 35)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testAdHocData()",
      "begin_line": 403,
      "end_line": 448,
      "comment": "\n     * Test of transformer for the ad hoc data taken from Mathematica.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 43)",
        "(line 406,col 9)-(line 406,col 76)",
        "(line 407,col 9)-(line 407,col 25)",
        "(line 407,col 27)-(line 407,col 51)",
        "(line 409,col 9)-(line 409,col 62)",
        "(line 410,col 9)-(line 418,col 63)",
        "(line 420,col 9)-(line 420,col 65)",
        "(line 421,col 9)-(line 424,col 9)",
        "(line 426,col 9)-(line 426,col 65)",
        "(line 427,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 71)",
        "(line 433,col 9)-(line 433,col 70)",
        "(line 434,col 9)-(line 434,col 25)",
        "(line 436,col 9)-(line 436,col 75)",
        "(line 437,col 9)-(line 437,col 66)",
        "(line 438,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 66)",
        "(line 444,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.testSinFunction()",
      "begin_line": 453,
      "end_line": 482,
      "comment": "\n     * Test of transformer for the sine function.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 456,col 43)",
        "(line 457,col 9)-(line 457,col 76)",
        "(line 458,col 9)-(line 458,col 25)",
        "(line 458,col 27)-(line 458,col 41)",
        "(line 459,col 9)-(line 459,col 43)",
        "(line 461,col 9)-(line 461,col 18)",
        "(line 461,col 20)-(line 461,col 43)",
        "(line 462,col 9)-(line 462,col 78)",
        "(line 463,col 9)-(line 463,col 65)",
        "(line 464,col 9)-(line 464,col 76)",
        "(line 465,col 9)-(line 465,col 67)",
        "(line 466,col 9)-(line 466,col 75)",
        "(line 467,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 27)",
        "(line 472,col 29)-(line 472,col 46)",
        "(line 473,col 9)-(line 473,col 78)",
        "(line 474,col 9)-(line 474,col 65)",
        "(line 475,col 9)-(line 475,col 71)",
        "(line 476,col 9)-(line 476,col 67)",
        "(line 477,col 9)-(line 477,col 72)",
        "(line 478,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.test2DData()",
      "begin_line": 488,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 43)",
        "(line 491,col 9)-(line 491,col 76)",
        "(line 493,col 9)-(line 493,col 33)",
        "(line 494,col 9)-(line 497,col 80)",
        "(line 498,col 9)-(line 500,col 44)",
        "(line 501,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 90)",
        "(line 508,col 9)-(line 508,col 92)",
        "(line 510,col 9)-(line 510,col 57)",
        "(line 511,col 9)-(line 511,col 58)",
        "(line 512,col 9)-(line 512,col 63)",
        "(line 513,col 9)-(line 513,col 64)",
        "(line 514,col 9)-(line 514,col 63)",
        "(line 515,col 9)-(line 515,col 64)",
        "(line 517,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformerTest.test2DDataUnitary()",
      "begin_line": 529,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 43)",
        "(line 532,col 9)-(line 532,col 75)",
        "(line 533,col 9)-(line 533,col 33)",
        "(line 534,col 9)-(line 537,col 80)",
        "(line 538,col 9)-(line 540,col 44)",
        "(line 541,col 9)-(line 541,col 90)",
        "(line 542,col 9)-(line 542,col 92)",
        "(line 544,col 9)-(line 544,col 57)",
        "(line 545,col 9)-(line 545,col 58)",
        "(line 546,col 9)-(line 546,col 63)",
        "(line 547,col 9)-(line 547,col 64)",
        "(line 548,col 9)-(line 548,col 63)",
        "(line 549,col 9)-(line 549,col 64)",
        "(line 551,col 9)-(line 560,col 9)"
      ]
    }
  ]
}