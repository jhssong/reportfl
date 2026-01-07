{
  "filepath": "/tmp/Math-6b/src/test/java/org/apache/commons/math3/linear/ConjugateGradientTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConjugateGradientTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 605,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testNonSquareOperator()",
      "begin_line": 32,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 70)",
        "(line 35,col 9)-(line 35,col 43)",
        "(line 36,col 9)-(line 36,col 54)",
        "(line 37,col 9)-(line 37,col 75)",
        "(line 38,col 9)-(line 38,col 78)",
        "(line 39,col 9)-(line 39,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testDimensionMismatchRightHandSide()",
      "begin_line": 42,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 70)",
        "(line 45,col 9)-(line 45,col 43)",
        "(line 46,col 9)-(line 46,col 54)",
        "(line 47,col 9)-(line 47,col 57)",
        "(line 48,col 9)-(line 48,col 57)",
        "(line 49,col 9)-(line 49,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testDimensionMismatchSolution()",
      "begin_line": 52,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 70)",
        "(line 55,col 9)-(line 55,col 43)",
        "(line 56,col 9)-(line 56,col 54)",
        "(line 57,col 9)-(line 57,col 57)",
        "(line 58,col 9)-(line 58,col 57)",
        "(line 59,col 9)-(line 59,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testNonPositiveDefiniteLinearOperator()",
      "begin_line": 62,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 70)",
        "(line 65,col 9)-(line 65,col 30)",
        "(line 66,col 9)-(line 66,col 29)",
        "(line 67,col 9)-(line 67,col 29)",
        "(line 68,col 9)-(line 68,col 29)",
        "(line 69,col 9)-(line 69,col 43)",
        "(line 70,col 9)-(line 70,col 53)",
        "(line 71,col 9)-(line 71,col 57)",
        "(line 72,col 9)-(line 72,col 27)",
        "(line 73,col 9)-(line 73,col 27)",
        "(line 74,col 9)-(line 74,col 57)",
        "(line 75,col 9)-(line 75,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedSolution()",
      "begin_line": 78,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 24)",
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 58)",
        "(line 83,col 9)-(line 83,col 70)",
        "(line 84,col 9)-(line 84,col 43)",
        "(line 85,col 9)-(line 85,col 67)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedInPlaceSolutionWithInitialGuess()",
      "begin_line": 101,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 24)",
        "(line 104,col 9)-(line 104,col 38)",
        "(line 105,col 9)-(line 105,col 58)",
        "(line 106,col 9)-(line 106,col 70)",
        "(line 107,col 9)-(line 107,col 43)",
        "(line 108,col 9)-(line 108,col 67)",
        "(line 109,col 9)-(line 109,col 52)",
        "(line 110,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedSolutionWithInitialGuess()",
      "begin_line": 127,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 24)",
        "(line 130,col 9)-(line 130,col 38)",
        "(line 131,col 9)-(line 131,col 58)",
        "(line 132,col 9)-(line 132,col 70)",
        "(line 133,col 9)-(line 133,col 43)",
        "(line 134,col 9)-(line 134,col 67)",
        "(line 135,col 9)-(line 135,col 52)",
        "(line 136,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedResidual()",
      "begin_line": 160,
      "end_line": 217,
      "comment": "\n     * Check whether the estimate of the (updated) residual corresponds to the\n     * exact residual. This fails to be true for a large number of iterations,\n     * due to the loss of orthogonality of the successive search directions.\n     * Therefore, in the present test, the number of iterations is limited.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 25)",
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 164,col 58)",
        "(line 165,col 9)-(line 165,col 39)",
        "(line 166,col 9)-(line 166,col 67)",
        "(line 167,col 9)-(line 167,col 52)",
        "(line 168,col 9)-(line 168,col 52)",
        "(line 169,col 9)-(line 191,col 10)",
        "(line 192,col 9)-(line 192,col 68)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 194,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-06144db4-000e-4fd3-bfc0-d27d90fcd73a.terminationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-9f15c096-c351-445c-bd84-7202abdbdabe.iterationStarted(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-1d542f8d-caad-4083-8c7a-ae3db98dfe0c.iterationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 179,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 180,col 17)-(line 180,col 53)",
        "(line 181,col 17)-(line 181,col 53)",
        "(line 182,col 17)-(line 182,col 49)",
        "(line 183,col 17)-(line 183,col 37)",
        "(line 184,col 17)-(line 184,col 38)",
        "(line 185,col 17)-(line 185,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-0b50d662-1d5b-4c1d-be78-2b3f95a5ec2d.initializationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testNonSquarePreconditioner()",
      "begin_line": 219,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 70)",
        "(line 222,col 9)-(line 238,col 10)",
        "(line 239,col 9)-(line 239,col 57)",
        "(line 240,col 9)-(line 240,col 54)",
        "(line 241,col 9)-(line 241,col 75)",
        "(line 242,col 9)-(line 242,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-dc3220e0-1651-4b92-b1a3-6d5e456bffca.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 17)-(line 226,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-4fb59db3-c63a-4137-b819-4db8f301ac34.getRowDimension()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 17)-(line 231,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-4d557b3a-4956-4723-b733-7ede78b3a940.getColumnDimension()",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 17)-(line 236,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testMismatchedOperatorDimensions()",
      "begin_line": 245,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 70)",
        "(line 248,col 9)-(line 264,col 10)",
        "(line 265,col 9)-(line 265,col 57)",
        "(line 266,col 9)-(line 266,col 54)",
        "(line 267,col 9)-(line 267,col 75)",
        "(line 268,col 9)-(line 268,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-98c89919-d192-4f81-a085-01e6621464c7.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 17)-(line 252,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-9522b191-ed3d-4194-96e5-98f7542f84d1.getRowDimension()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 17)-(line 257,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-f00efc44-f8b9-4b14-84e3-9d178087279b.getColumnDimension()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 17)-(line 262,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testNonPositiveDefinitePreconditioner()",
      "begin_line": 271,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 70)",
        "(line 274,col 9)-(line 274,col 29)",
        "(line 275,col 9)-(line 275,col 29)",
        "(line 276,col 9)-(line 276,col 29)",
        "(line 277,col 9)-(line 277,col 29)",
        "(line 278,col 9)-(line 297,col 10)",
        "(line 298,col 9)-(line 298,col 57)",
        "(line 299,col 9)-(line 299,col 53)",
        "(line 300,col 9)-(line 300,col 57)",
        "(line 301,col 9)-(line 301,col 27)",
        "(line 302,col 9)-(line 302,col 27)",
        "(line 303,col 9)-(line 303,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-633a5614-3789-4789-99b0-fcc1a52403ae.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 280,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 282,col 17)-(line 282,col 65)",
        "(line 283,col 17)-(line 283,col 46)",
        "(line 284,col 17)-(line 284,col 45)",
        "(line 285,col 17)-(line 285,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-b4148017-b689-4ca8-9efe-9f8fb1124c86.getRowDimension()",
      "begin_line": 288,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 17)-(line 290,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-5c5554fa-9c47-4215-95b6-5bb63deb9b4b.getColumnDimension()",
      "begin_line": 293,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 17)-(line 295,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testPreconditionedSolution()",
      "begin_line": 306,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 24)",
        "(line 309,col 9)-(line 309,col 38)",
        "(line 310,col 9)-(line 310,col 58)",
        "(line 311,col 9)-(line 311,col 70)",
        "(line 312,col 9)-(line 312,col 68)",
        "(line 313,col 9)-(line 313,col 57)",
        "(line 314,col 9)-(line 314,col 67)",
        "(line 315,col 9)-(line 315,col 52)",
        "(line 316,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testPreconditionedResidual()",
      "begin_line": 330,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 25)",
        "(line 333,col 9)-(line 333,col 36)",
        "(line 334,col 9)-(line 334,col 58)",
        "(line 335,col 9)-(line 335,col 68)",
        "(line 336,col 9)-(line 336,col 39)",
        "(line 337,col 9)-(line 337,col 67)",
        "(line 338,col 9)-(line 338,col 52)",
        "(line 339,col 9)-(line 339,col 52)",
        "(line 340,col 9)-(line 362,col 10)",
        "(line 363,col 9)-(line 363,col 68)",
        "(line 364,col 9)-(line 364,col 52)",
        "(line 366,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-72183c96-9104-4d74-85c9-223b761b3c4b.terminationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-e82c3ecd-b7a1-4b7f-823c-7ecfcf0dc276.iterationStarted(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-cfb9ac6c-b362-4943-85eb-bd755ce6facd.iterationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 350,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 351,col 17)-(line 351,col 53)",
        "(line 352,col 17)-(line 352,col 53)",
        "(line 353,col 17)-(line 353,col 49)",
        "(line 354,col 17)-(line 354,col 37)",
        "(line 355,col 17)-(line 355,col 38)",
        "(line 356,col 17)-(line 356,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-8a30cd70-2fc2-45e1-820e-725c0deb9d50.initializationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testPreconditionedSolution2()",
      "begin_line": 391,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 26)",
        "(line 394,col 9)-(line 394,col 41)",
        "(line 395,col 9)-(line 395,col 70)",
        "(line 396,col 9)-(line 396,col 25)",
        "(line 397,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 68)",
        "(line 410,col 9)-(line 410,col 54)",
        "(line 411,col 9)-(line 411,col 39)",
        "(line 412,col 9)-(line 412,col 63)",
        "(line 413,col 9)-(line 413,col 62)",
        "(line 414,col 9)-(line 414,col 52)",
        "(line 415,col 9)-(line 416,col 91)",
        "(line 417,col 9)-(line 417,col 19)",
        "(line 418,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testEventManagement()",
      "begin_line": 437,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 24)",
        "(line 440,col 9)-(line 440,col 38)",
        "(line 441,col 9)-(line 441,col 58)",
        "(line 442,col 9)-(line 442,col 43)",
        "(line 449,col 9)-(line 449,col 51)",
        "(line 450,col 9)-(line 497,col 10)",
        "(line 498,col 9)-(line 498,col 67)",
        "(line 499,col 9)-(line 499,col 68)",
        "(line 500,col 9)-(line 500,col 52)",
        "(line 501,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-4cca2264-10f9-4249-ba96-f18d545fbecc.doTestVectorsAreUnmodifiable(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 451,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 452,col 17)-(line 452,col 53)",
        "(line 453,col 17)-(line 453,col 53)",
        "(line 454,col 17)-(line 459,col 17)",
        "(line 460,col 17)-(line 465,col 17)",
        "(line 466,col 17)-(line 471,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-9dc61221-de99-40d6-9580-b59dbc4b7688.initializationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 474,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 475,col 17)-(line 475,col 27)",
        "(line 476,col 17)-(line 476,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-3465dadb-868c-4d29-9f43-d926f3c1fc2d.iterationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 479,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 480,col 17)-(line 480,col 27)",
        "(line 481,col 17)-(line 482,col 53)",
        "(line 483,col 17)-(line 483,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-ae8e1da6-6009-4ad0-b3d2-dcb8fd0981bb.iterationStarted(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 486,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 487,col 17)-(line 487,col 27)",
        "(line 488,col 17)-(line 489,col 53)",
        "(line 490,col 17)-(line 490,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-de4c1b71-d28f-4d79-812f-34944ecd0bcb.terminationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 493,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 494,col 17)-(line 494,col 27)",
        "(line 495,col 17)-(line 495,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedNormOfResidual()",
      "begin_line": 513,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 24)",
        "(line 516,col 9)-(line 516,col 38)",
        "(line 517,col 9)-(line 517,col 58)",
        "(line 518,col 9)-(line 518,col 43)",
        "(line 519,col 9)-(line 548,col 10)",
        "(line 549,col 9)-(line 549,col 67)",
        "(line 550,col 9)-(line 550,col 68)",
        "(line 551,col 9)-(line 551,col 52)",
        "(line 552,col 9)-(line 556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-f4b7eb79-dfbd-4dfc-967c-8adabc295544.doTestNormOfResidual(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 521,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 522,col 17)-(line 522,col 53)",
        "(line 523,col 17)-(line 523,col 53)",
        "(line 524,col 17)-(line 524,col 55)",
        "(line 525,col 17)-(line 525,col 66)",
        "(line 526,col 17)-(line 526,col 62)",
        "(line 527,col 17)-(line 527,col 49)",
        "(line 528,col 17)-(line 530,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-da4b6850-35b7-440c-bbc3-3dab184aafc1.initializationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 17)-(line 534,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-3725433d-8c7d-47c8-a89b-a1b09e35f2db.iterationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 17)-(line 538,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-788b6684-11f3-4a85-9771-7ddb9397eac6.iterationStarted(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 17)-(line 542,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-cc51299f-c804-499d-b7a0-60ee58e6b742.terminationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 545,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 17)-(line 546,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.testPreconditionedNormOfResidual()",
      "begin_line": 559,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 24)",
        "(line 562,col 9)-(line 562,col 38)",
        "(line 563,col 9)-(line 563,col 58)",
        "(line 564,col 9)-(line 564,col 68)",
        "(line 565,col 9)-(line 565,col 57)",
        "(line 566,col 9)-(line 595,col 10)",
        "(line 596,col 9)-(line 596,col 67)",
        "(line 597,col 9)-(line 597,col 68)",
        "(line 598,col 9)-(line 598,col 52)",
        "(line 599,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-aae4e4c8-52cd-4017-abce-9cdcc1b54122.doTestNormOfResidual(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 568,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 569,col 17)-(line 569,col 53)",
        "(line 570,col 17)-(line 570,col 53)",
        "(line 571,col 17)-(line 571,col 55)",
        "(line 572,col 17)-(line 572,col 66)",
        "(line 573,col 17)-(line 573,col 62)",
        "(line 574,col 17)-(line 574,col 49)",
        "(line 575,col 17)-(line 577,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-a9851b83-7b9d-4098-a76c-b16bb9fd9c38.initializationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 580,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 581,col 17)-(line 581,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-5a0b2821-9658-461a-8950-a6adf47419a5.iterationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 17)-(line 585,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-cc8895a3-536e-4116-808a-5e9fdb1c9439.iterationStarted(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 588,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 17)-(line 589,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradientTest.Anonymous-4d44b08e-1f81-4bb1-a6bf-15fac6729f42.terminationPerformed(org.apache.commons.math3.util.IterationEvent)",
      "begin_line": 592,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 593,col 17)-(line 593,col 40)"
      ]
    }
  ]
}