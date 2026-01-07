{
  "filepath": "/tmp/Math-37b/src/test/java/org/apache/commons/math/linear/ConjugateGradientTest.java",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-9e8a69b7-11e0-4609-8e37-1eec092d2db3.terminationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-6026caa4-ed90-4e32-af24-2a8c6df37d5c.iterationStarted(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-c11b2ddf-6af8-4814-b055-464d0de86c93.iterationPerformed(org.apache.commons.math.util.IterationEvent)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-3ac2499a-ec8f-45eb-bf83-01cae80f9e10.initializationPerformed(org.apache.commons.math.util.IterationEvent)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-d69828b6-8447-42d5-9633-4ea2970575a3.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 17)-(line 221,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-22e510bc-3eba-468c-ad58-44dd69269bda.getRowDimension()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 17)-(line 226,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-2d5fcdf9-0278-4a29-a9b4-36fb43cbf49a.getColumnDimension()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 17)-(line 231,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-158ac019-de9e-4510-8f5b-1e3b8be52f14.solve(org.apache.commons.math.linear.RealVector)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-bd0a64cc-df3d-498b-bffa-19e77f870fad.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 17)-(line 253,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-66828666-e6e8-49db-a017-8e935a32b290.getRowDimension()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 17)-(line 258,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-f199b56e-d1e4-4dd4-b03e-de6c48fab483.getColumnDimension()",
      "begin_line": 261,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 17)-(line 263,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-1425d926-8fac-47c1-9175-1103ecd43f78.solve(org.apache.commons.math.linear.RealVector)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-32b84a5f-6e0b-4d56-a558-d02c9abb77af.operate(org.apache.commons.math.linear.RealVector)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-47652450-4aa2-40c0-85c7-ac17896a2d65.getRowDimension()",
      "begin_line": 295,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 297,col 17)-(line 297,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-98d90215-1efb-4e81-bb7e-daf19dbd5d15.getColumnDimension()",
      "begin_line": 300,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 17)-(line 302,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-a2166269-7907-4c01-a311-6bd686fa0b73.solve(org.apache.commons.math.linear.RealVector)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-962bf25a-08c7-4ca8-9527-7946512694c3.terminationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-1eef66a6-0a95-4aab-8ace-8dc88e389202.iterationStarted(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-a9aeed8b-2a54-49c4-93ba-eb8b7ca23690.iterationPerformed(org.apache.commons.math.util.IterationEvent)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-fc992aea-6193-4d39-a70f-52d9a018b059.initializationPerformed(org.apache.commons.math.util.IterationEvent)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-2afc28e8-64aa-46ca-874e-d3743c3ab7df.initializationPerformed(org.apache.commons.math.util.IterationEvent)",
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
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-6dbf2f15-abf0-42b2-a87e-671cd31df1a7.iterationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 470,col 17)-(line 470,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-dc1be862-7394-4a93-9741-b7c7fa0d31dc.iterationStarted(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 473,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 474,col 17)-(line 474,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradientTest.Anonymous-8aa3d6e3-034c-4341-a396-aeb21dd812e2.terminationPerformed(org.apache.commons.math.util.IterationEvent)",
      "begin_line": 478,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 17)-(line 479,col 27)"
      ]
    }
  ]
}