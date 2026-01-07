{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 508,
      "comment": "\n * Utilities for manipulating function objects.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.FunctionUtils()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Class only contains static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 49,
      "end_line": 60,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 59,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-cc3857d3-bec8-4332-bf95-a8af2f749846.value(double)",
      "begin_line": 52,
      "end_line": 58,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 53,col 17)-(line 53,col 29)",
        "(line 54,col 17)-(line 56,col 17)",
        "(line 57,col 17)-(line 57,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 72,
      "end_line": 94,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 93,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-889b967c-64cb-4cba-8121-915b8d8a9635.value(double)",
      "begin_line": 76,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 17)-(line 77,col 29)",
        "(line 78,col 17)-(line 80,col 17)",
        "(line 81,col 17)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-3ad43576-269c-411d-8739-dc81d204f9f5.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 85,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 17)-(line 86,col 42)",
        "(line 87,col 17)-(line 89,col 17)",
        "(line 90,col 17)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 106,
      "end_line": 133,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     * @deprecated as of 3.1 replaced by {@link #compose(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 132,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f32362f2-3974-4e5e-8e6e-72cbdd2f4ced.value(double)",
      "begin_line": 109,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 17)-(line 110,col 29)",
        "(line 111,col 17)-(line 113,col 17)",
        "(line 114,col 17)-(line 114,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-5cdccbd6-043e-46e8-bbfd-addec62a0607.derivative()",
      "begin_line": 118,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 17)-(line 130,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-daeb8730-c13c-4d01-8a96-736553a6423c.value(double)",
      "begin_line": 121,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 25)-(line 122,col 37)",
        "(line 123,col 25)-(line 123,col 37)",
        "(line 124,col 25)-(line 127,col 25)",
        "(line 128,col 25)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 141,
      "end_line": 152,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 151,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f41b795c-c3fc-4a2c-8b59-4e11f0e0d035.value(double)",
      "begin_line": 144,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 17)-(line 145,col 41)",
        "(line 146,col 17)-(line 148,col 17)",
        "(line 149,col 17)-(line 149,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 161,
      "end_line": 183,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 182,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-18a1860e-f3d1-4ab6-af36-cef02b4e9b03.value(double)",
      "begin_line": 165,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 17)-(line 166,col 41)",
        "(line 167,col 17)-(line 169,col 17)",
        "(line 170,col 17)-(line 170,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-e6cebac8-6a2d-4d2c-9627-306462820062.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 174,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 17)-(line 175,col 54)",
        "(line 176,col 17)-(line 178,col 17)",
        "(line 179,col 17)-(line 179,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 192,
      "end_line": 218,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @deprecated as of 3.1 replaced by {@link #add(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 217,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1ae83507-e4b0-4319-bb7c-44bea6aa5630.value(double)",
      "begin_line": 196,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 17)-(line 197,col 41)",
        "(line 198,col 17)-(line 200,col 17)",
        "(line 201,col 17)-(line 201,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7103112c-ca9c-4eef-9f69-887aaa9c3047.derivative()",
      "begin_line": 205,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 17)-(line 215,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-fad54605-7816-4303-a085-5514956bb24e.value(double)",
      "begin_line": 208,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 25)-(line 209,col 62)",
        "(line 210,col 25)-(line 212,col 25)",
        "(line 213,col 25)-(line 213,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 226,
      "end_line": 237,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 236,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1a7753b8-d88a-4ae4-88b4-3e9e24342f51.value(double)",
      "begin_line": 229,
      "end_line": 235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 17)-(line 230,col 41)",
        "(line 231,col 17)-(line 233,col 17)",
        "(line 234,col 17)-(line 234,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 246,
      "end_line": 268,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 267,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-da2a9d30-1602-4b55-a21f-3421a68fcef4.value(double)",
      "begin_line": 250,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 17)-(line 251,col 41)",
        "(line 252,col 17)-(line 254,col 17)",
        "(line 255,col 17)-(line 255,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-6f931f95-1e57-4c0e-98c7-cccdcaea45ac.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 259,
      "end_line": 265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 17)-(line 260,col 54)",
        "(line 261,col 17)-(line 263,col 17)",
        "(line 264,col 17)-(line 264,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 277,
      "end_line": 308,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @deprecated as of 3.1 replaced by {@link #multiply(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 307,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9b2060f4-a82b-45d1-b851-e7d80eb9672e.value(double)",
      "begin_line": 280,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 281,col 17)-(line 281,col 41)",
        "(line 282,col 17)-(line 284,col 17)",
        "(line 285,col 17)-(line 285,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-79efa598-c5bd-4264-84f6-72e3265b838c.derivative()",
      "begin_line": 289,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 17)-(line 305,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-6b052075-b6be-45a0-8edf-06b7f8753099.value(double)",
      "begin_line": 292,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 25)-(line 293,col 39)",
        "(line 294,col 25)-(line 302,col 25)",
        "(line 303,col 25)-(line 303,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.combine(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 319,
      "end_line": 328,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 327,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-01763416-d42d-4f67-b424-1efc35bc166c.value(double)",
      "begin_line": 324,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 17)-(line 325,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, double)",
      "begin_line": 340,
      "end_line": 353,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 352,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-fed1b5ab-974f-457b-9339-e0050068bb28.value(double[])",
      "begin_line": 345,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 346,col 17)-(line 346,col 80)",
        "(line 347,col 17)-(line 349,col 17)",
        "(line 350,col 17)-(line 350,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 376,
      "end_line": 384,
      "comment": "\n     * Creates a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 383,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-bc9c7891-230f-4e66-8855-622d7df29e18.value(double)",
      "begin_line": 380,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 17)-(line 381,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 392,
      "end_line": 400,
      "comment": "\n     * Creates a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 399,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-148d6b96-c319-493d-a044-feea6e4f81f8.value(double)",
      "begin_line": 396,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 397,col 17)-(line 397,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.sample(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 419,
      "end_line": 437,
      "comment": "\n     * Samples the specified univariate real function on the specified interval.\n     * \u003cbr/\u003e\n     * The interval is divided equally into {@code n} sections and sample points\n     * are taken from {@code min} to {@code max - (max - min) / n}; therefore\n     * {@code f} is not sampled at the upper bound {@code max}.\n     *\n     * @param f Function to be sampled\n     * @param min Lower bound of the interval (included).\n     * @param max Upper bound of the interval (excluded).\n     * @param n Number of sample points.\n     * @return the array of samples.\n     * @throws NumberIsTooLargeException if the lower bound {@code min} is\n     * greater than, or equal to the upper bound {@code max}.\n     * @throws NotStrictlyPositiveException if the number of sample points\n     * {@code n} is negative.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 431,col 9)-(line 431,col 41)",
        "(line 432,col 9)-(line 432,col 41)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction)",
      "begin_line": 445,
      "end_line": 465,
      "comment": " Convert a {@link UnivariateDifferentiableFunction} into a {@link DifferentiableUnivariateFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 464,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-e1c9a2e0-5ec3-4564-a53b-2323870917c2.value(double)",
      "begin_line": 450,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 451,col 17)-(line 451,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-dd3ac2c2-f498-4f30-99e2-1d2633812121.derivative()",
      "begin_line": 455,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 17)-(line 461,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7577052f-be3b-45fc-ba65-ece2b67aaac6.value(double)",
      "begin_line": 458,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 25)-(line 459,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toUnivariateDifferential(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction)",
      "begin_line": 478,
      "end_line": 506,
      "comment": " Convert a {@link DifferentiableUnivariateFunction} into a {@link UnivariateDifferentiableFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} with\n     * \u003cem\u003eonly\u003c/em\u003e one parameter and up to order one. If the function is called with\n     * more parameters or higher order, a {@link DimensionMismatchException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 505,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ec22f479-11ef-4000-8bb6-fc4c33a49074.value(double)",
      "begin_line": 483,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 17)-(line 484,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-55ed32a9-5446-406d-a5f9-8d239fe4a042.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 491,
      "end_line": 503,
      "comment": " {@inheritDoc}\n             * @exception DimensionMismatchException if number of parameters or derivation\n             * order are higher than 1\n             ",
      "child_ranges": [
        "(line 493,col 17)-(line 495,col 17)",
        "(line 496,col 17)-(line 498,col 17)",
        "(line 499,col 17)-(line 502,col 19)"
      ]
    }
  ]
}