{
  "filepath": "/tmp/Math-42b/src/test/java/org/apache/commons/math/linear/ConjugateGradientTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConjugateGradientTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 501,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testNonSquareOperator()",
      "begin_line": 28,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 70)",
        "(line 31,col 9)-(line 31,col 43)",
        "(line 32,col 9)-(line 32,col 54)",
        "(line 33,col 9)-(line 33,col 75)",
        "(line 34,col 9)-(line 34,col 78)",
        "(line 35,col 9)-(line 35,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testDimensionMismatchRightHandSide()",
      "begin_line": 38,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 70)",
        "(line 41,col 9)-(line 41,col 43)",
        "(line 42,col 9)-(line 42,col 54)",
        "(line 43,col 9)-(line 43,col 57)",
        "(line 44,col 9)-(line 44,col 57)",
        "(line 45,col 9)-(line 45,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testDimensionMismatchSolution()",
      "begin_line": 48,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 70)",
        "(line 51,col 9)-(line 51,col 43)",
        "(line 52,col 9)-(line 52,col 54)",
        "(line 53,col 9)-(line 53,col 57)",
        "(line 54,col 9)-(line 54,col 57)",
        "(line 55,col 9)-(line 55,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testNonPositiveDefiniteLinearOperator()",
      "begin_line": 58,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 70)",
        "(line 61,col 9)-(line 61,col 30)",
        "(line 62,col 9)-(line 62,col 29)",
        "(line 63,col 9)-(line 63,col 29)",
        "(line 64,col 9)-(line 64,col 29)",
        "(line 65,col 9)-(line 65,col 43)",
        "(line 66,col 9)-(line 66,col 53)",
        "(line 67,col 9)-(line 67,col 57)",
        "(line 68,col 9)-(line 68,col 27)",
        "(line 69,col 9)-(line 69,col 27)",
        "(line 70,col 9)-(line 70,col 57)",
        "(line 71,col 9)-(line 71,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testUnpreconditionedSolution()",
      "begin_line": 74,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 24)",
        "(line 77,col 9)-(line 77,col 38)",
        "(line 78,col 9)-(line 78,col 58)",
        "(line 79,col 9)-(line 79,col 70)",
        "(line 80,col 9)-(line 80,col 43)",
        "(line 81,col 9)-(line 81,col 67)",
        "(line 82,col 9)-(line 82,col 52)",
        "(line 83,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testUnpreconditionedInPlaceSolutionWithInitialGuess()",
      "begin_line": 97,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 24)",
        "(line 100,col 9)-(line 100,col 38)",
        "(line 101,col 9)-(line 101,col 58)",
        "(line 102,col 9)-(line 102,col 70)",
        "(line 103,col 9)-(line 103,col 43)",
        "(line 104,col 9)-(line 104,col 67)",
        "(line 105,col 9)-(line 105,col 52)",
        "(line 106,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testUnpreconditionedSolutionWithInitialGuess()",
      "begin_line": 123,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 24)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 58)",
        "(line 128,col 9)-(line 128,col 70)",
        "(line 129,col 9)-(line 129,col 43)",
        "(line 130,col 9)-(line 130,col 67)",
        "(line 131,col 9)-(line 131,col 52)",
        "(line 132,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testUnpreconditionedResidual()",
      "begin_line": 156,
      "end_line": 211,
      "comment": "\n     * Check whether the estimate of the (updated) residual corresponds to the\n     * exact residual. This fails to be true for a large number of iterations,\n     * due to the loss of orthogonality of the successive search directions.\n     * Therefore, in the present test, the number of iterations is limited.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 25)",
        "(line 159,col 9)-(line 159,col 36)",
        "(line 160,col 9)-(line 160,col 58)",
        "(line 161,col 9)-(line 161,col 39)",
        "(line 162,col 9)-(line 162,col 67)",
        "(line 163,col 9)-(line 163,col 52)",
        "(line 164,col 9)-(line 164,col 52)",
        "(line 165,col 9)-(line 185,col 10)",
        "(line 186,col 9)-(line 186,col 68)",
        "(line 187,col 9)-(line 187,col 52)",
        "(line 188,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-6122c9b5-2f41-4a2c-8b91-6575bb1ad853.terminationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-2062f592-53cd-4e49-8521-1514864efaae.iterationStarted(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-155ced5b-6de8-44bb-bde9-d7d6f15f0002.iterationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 175,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 176,col 17)-(line 176,col 67)",
        "(line 177,col 17)-(line 177,col 37)",
        "(line 178,col 17)-(line 178,col 67)",
        "(line 179,col 17)-(line 179,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-de9e1582-31ac-45a8-945c-d9ccf464b1c8.initializationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testNonSquarePreconditioner()",
      "begin_line": 213,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 70)",
        "(line 216,col 9)-(line 216,col 45)",
        "(line 217,col 9)-(line 238,col 10)",
        "(line 239,col 9)-(line 239,col 57)",
        "(line 240,col 9)-(line 240,col 54)",
        "(line 241,col 9)-(line 241,col 75)",
        "(line 242,col 9)-(line 242,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-7129da6a-067b-4151-9d6d-598e1e594686.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 17)-(line 221,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-9ffbc46f-3a4e-465a-85ae-ad08162a9641.getRowDimension()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 17)-(line 226,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-51c87a36-16da-4628-85d7-5dd17dd9f0be.getColumnDimension()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 17)-(line 231,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-f0dd3daa-46ca-4b4d-a64b-f02d42a0db55.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 17)-(line 236,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testMismatchedOperatorDimensions()",
      "begin_line": 245,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 70)",
        "(line 248,col 9)-(line 248,col 45)",
        "(line 249,col 9)-(line 270,col 10)",
        "(line 271,col 9)-(line 271,col 57)",
        "(line 272,col 9)-(line 272,col 54)",
        "(line 273,col 9)-(line 273,col 75)",
        "(line 274,col 9)-(line 274,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-525cf8eb-efae-4699-94fa-0f431640283a.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 17)-(line 253,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-b7c04fc6-c154-4478-ab25-a9e6eef38664.getRowDimension()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 17)-(line 258,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-8b8795e2-2e73-4ca6-be1a-5bb219845dfd.getColumnDimension()",
      "begin_line": 261,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 17)-(line 263,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-d436315e-f770-4ab3-b82a-cf91fb3374dd.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 17)-(line 268,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testNonPositiveDefinitePreconditioner()",
      "begin_line": 277,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 70)",
        "(line 280,col 9)-(line 280,col 29)",
        "(line 281,col 9)-(line 281,col 29)",
        "(line 282,col 9)-(line 282,col 29)",
        "(line 283,col 9)-(line 283,col 29)",
        "(line 284,col 9)-(line 284,col 45)",
        "(line 285,col 9)-(line 312,col 10)",
        "(line 313,col 9)-(line 313,col 57)",
        "(line 314,col 9)-(line 314,col 53)",
        "(line 315,col 9)-(line 315,col 57)",
        "(line 316,col 9)-(line 316,col 27)",
        "(line 317,col 9)-(line 317,col 27)",
        "(line 318,col 9)-(line 318,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-8eb80d7e-1bd3-4413-934a-04434bd04498.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 287,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 289,col 17)-(line 289,col 65)",
        "(line 290,col 17)-(line 290,col 46)",
        "(line 291,col 17)-(line 291,col 45)",
        "(line 292,col 17)-(line 292,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-c44de978-faa9-41d2-b207-42aa248a15fe.getRowDimension()",
      "begin_line": 295,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 297,col 17)-(line 297,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-ed4e0ca1-a5f2-4cfd-bfb5-ce23a3fc37aa.getColumnDimension()",
      "begin_line": 300,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 17)-(line 302,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-bac093b6-7c96-4324-b177-660ce7bfff9e.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 305,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 307,col 17)-(line 307,col 65)",
        "(line 308,col 17)-(line 308,col 46)",
        "(line 309,col 17)-(line 309,col 45)",
        "(line 310,col 17)-(line 310,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testPreconditionedSolution()",
      "begin_line": 321,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 24)",
        "(line 324,col 9)-(line 324,col 38)",
        "(line 325,col 9)-(line 325,col 58)",
        "(line 326,col 9)-(line 326,col 70)",
        "(line 327,col 9)-(line 327,col 78)",
        "(line 328,col 9)-(line 328,col 57)",
        "(line 329,col 9)-(line 329,col 67)",
        "(line 330,col 9)-(line 330,col 52)",
        "(line 331,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testPreconditionedResidual()",
      "begin_line": 345,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 25)",
        "(line 348,col 9)-(line 348,col 36)",
        "(line 349,col 9)-(line 349,col 58)",
        "(line 350,col 9)-(line 350,col 78)",
        "(line 351,col 9)-(line 351,col 39)",
        "(line 352,col 9)-(line 352,col 67)",
        "(line 353,col 9)-(line 353,col 52)",
        "(line 354,col 9)-(line 354,col 52)",
        "(line 355,col 9)-(line 375,col 10)",
        "(line 376,col 9)-(line 376,col 68)",
        "(line 377,col 9)-(line 377,col 52)",
        "(line 379,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-c068de58-a366-4020-9ff1-54fcd818e9c2.terminationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-ea294617-fe91-4fe6-81e3-ec18f9898946.iterationStarted(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-7d27631a-44a9-4e76-bb20-d0ae5009a7d0.iterationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 365,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 366,col 17)-(line 366,col 67)",
        "(line 367,col 17)-(line 367,col 37)",
        "(line 368,col 17)-(line 368,col 67)",
        "(line 369,col 17)-(line 369,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-7a05cc98-f92b-4c3f-a7a4-da4c5380619d.initializationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 372,
      "end_line": 374,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testPreconditionedSolution2()",
      "begin_line": 404,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 26)",
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 70)",
        "(line 409,col 9)-(line 409,col 25)",
        "(line 410,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 78)",
        "(line 423,col 9)-(line 423,col 54)",
        "(line 424,col 9)-(line 424,col 39)",
        "(line 425,col 9)-(line 425,col 63)",
        "(line 426,col 9)-(line 426,col 62)",
        "(line 427,col 9)-(line 427,col 52)",
        "(line 428,col 9)-(line 429,col 91)",
        "(line 430,col 9)-(line 430,col 19)",
        "(line 431,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.testEventManagement()",
      "begin_line": 450,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 24)",
        "(line 453,col 9)-(line 453,col 38)",
        "(line 454,col 9)-(line 454,col 58)",
        "(line 455,col 9)-(line 455,col 43)",
        "(line 456,col 9)-(line 458,col 10)",
        "(line 459,col 9)-(line 481,col 10)",
        "(line 482,col 9)-(line 482,col 67)",
        "(line 483,col 9)-(line 483,col 68)",
        "(line 484,col 9)-(line 484,col 52)",
        "(line 485,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-57b83e32-2b89-4dd5-a757-e7736c8d3166.initializationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 461,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 462,col 17)-(line 462,col 29)",
        "(line 463,col 17)-(line 463,col 29)",
        "(line 464,col 17)-(line 464,col 29)",
        "(line 465,col 17)-(line 465,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-c3d0f3cc-eedb-4a9d-b695-368aa671c72e.iterationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 470,col 17)-(line 470,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-aab24241-e8fa-4499-b80f-c704978dcb81.iterationStarted(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 473,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 474,col 17)-(line 474,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-147bd034-bb0a-47dd-a39b-05a2a8fe1076.terminationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 478,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 17)-(line 479,col 27)"
      ]
    }
  ]
}