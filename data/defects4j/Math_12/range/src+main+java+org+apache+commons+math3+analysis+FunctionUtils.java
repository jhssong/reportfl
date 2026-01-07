{
  "filepath": "/tmp/Math-12b/src/main/java/org/apache/commons/math3/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 791,
      "comment": "\n * Utilities for manipulating function objects.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.FunctionUtils()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Class only contains static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 51,
      "end_line": 62,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 61,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a5d07a70-4e92-4d11-b12b-097d576b74ee.value(double)",
      "begin_line": 54,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 55,col 17)-(line 55,col 29)",
        "(line 56,col 17)-(line 58,col 17)",
        "(line 59,col 17)-(line 59,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 74,
      "end_line": 96,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 95,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f9a5b54a-442e-4072-82d2-8a96c5e29dd8.value(double)",
      "begin_line": 78,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 17)-(line 79,col 29)",
        "(line 80,col 17)-(line 82,col 17)",
        "(line 83,col 17)-(line 83,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-016c4927-9bac-4464-8fd4-27829fcecca9.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 87,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 17)-(line 88,col 42)",
        "(line 89,col 17)-(line 91,col 17)",
        "(line 92,col 17)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 108,
      "end_line": 135,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     * @deprecated as of 3.1 replaced by {@link #compose(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 134,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-eac3680d-79f8-435c-8d30-1dec3773f9fe.value(double)",
      "begin_line": 111,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 17)-(line 112,col 29)",
        "(line 113,col 17)-(line 115,col 17)",
        "(line 116,col 17)-(line 116,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-6ddd8719-2c1a-452d-afa4-275336753e2d.derivative()",
      "begin_line": 120,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 17)-(line 132,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-42fd27e4-bd22-452e-828f-49249d33c70d.value(double)",
      "begin_line": 123,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 25)-(line 124,col 37)",
        "(line 125,col 25)-(line 125,col 37)",
        "(line 126,col 25)-(line 129,col 25)",
        "(line 130,col 25)-(line 130,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 143,
      "end_line": 154,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 153,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-fb59d59a-7f96-46c3-bcf2-9b20292d95f9.value(double)",
      "begin_line": 146,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 17)-(line 147,col 41)",
        "(line 148,col 17)-(line 150,col 17)",
        "(line 151,col 17)-(line 151,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 163,
      "end_line": 185,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 184,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a74b4506-39bc-4e74-aea0-997908cbcac6.value(double)",
      "begin_line": 167,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 17)-(line 168,col 41)",
        "(line 169,col 17)-(line 171,col 17)",
        "(line 172,col 17)-(line 172,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-01ace296-e3f0-470d-9a96-ca9d70d0abf4.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 176,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 17)-(line 177,col 54)",
        "(line 178,col 17)-(line 180,col 17)",
        "(line 181,col 17)-(line 181,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 194,
      "end_line": 220,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @deprecated as of 3.1 replaced by {@link #add(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 219,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f370f173-d6bb-4623-be26-51c608574c97.value(double)",
      "begin_line": 198,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 17)-(line 199,col 41)",
        "(line 200,col 17)-(line 202,col 17)",
        "(line 203,col 17)-(line 203,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ed8156c8-c30f-47ba-b41b-a993d8d015ac.derivative()",
      "begin_line": 207,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 17)-(line 217,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c7972a51-884b-4f20-88ac-221520ff9d52.value(double)",
      "begin_line": 210,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 25)-(line 211,col 62)",
        "(line 212,col 25)-(line 214,col 25)",
        "(line 215,col 25)-(line 215,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 228,
      "end_line": 239,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 238,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-06c75635-69f3-42b5-912c-eddfca13e409.value(double)",
      "begin_line": 231,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 17)-(line 232,col 41)",
        "(line 233,col 17)-(line 235,col 17)",
        "(line 236,col 17)-(line 236,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 248,
      "end_line": 270,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 269,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a083fe27-5433-4de5-89cc-9ceb0ea7e2a8.value(double)",
      "begin_line": 252,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 17)-(line 253,col 41)",
        "(line 254,col 17)-(line 256,col 17)",
        "(line 257,col 17)-(line 257,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-35be417a-ab5a-491d-ba42-46c3449d178c.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 261,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 17)-(line 262,col 54)",
        "(line 263,col 17)-(line 265,col 17)",
        "(line 266,col 17)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 279,
      "end_line": 310,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @deprecated as of 3.1 replaced by {@link #multiply(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 309,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-d2f5bf2b-86b7-4557-b858-a9bff7553b72.value(double)",
      "begin_line": 282,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 17)-(line 283,col 41)",
        "(line 284,col 17)-(line 286,col 17)",
        "(line 287,col 17)-(line 287,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-b71cb579-77fc-4c0e-b193-43b95c69c297.derivative()",
      "begin_line": 291,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 17)-(line 307,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-df966951-0779-40ce-9a2c-76f90ed02beb.value(double)",
      "begin_line": 294,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 25)-(line 295,col 39)",
        "(line 296,col 25)-(line 304,col 25)",
        "(line 305,col 25)-(line 305,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.combine(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 321,
      "end_line": 330,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 329,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ea363cba-9d84-416d-bc06-ef1bb845a166.value(double)",
      "begin_line": 326,
      "end_line": 328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 17)-(line 327,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, double)",
      "begin_line": 342,
      "end_line": 355,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 354,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c454caee-816c-4454-a436-cb942bc591e4.value(double[])",
      "begin_line": 347,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 17)-(line 348,col 80)",
        "(line 349,col 17)-(line 351,col 17)",
        "(line 352,col 17)-(line 352,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 366,
      "end_line": 369,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 378,
      "end_line": 386,
      "comment": "\n     * Creates a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 385,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-84287a2d-a77f-4e9a-a19f-c6a5604f9256.value(double)",
      "begin_line": 382,
      "end_line": 384,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 17)-(line 383,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 394,
      "end_line": 402,
      "comment": "\n     * Creates a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 401,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-08ce0e7d-d76d-49e1-83da-2b5dce30b933.value(double)",
      "begin_line": 398,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 399,col 17)-(line 399,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.sample(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 421,
      "end_line": 439,
      "comment": "\n     * Samples the specified univariate real function on the specified interval.\n     * \u003cbr/\u003e\n     * The interval is divided equally into {@code n} sections and sample points\n     * are taken from {@code min} to {@code max - (max - min) / n}; therefore\n     * {@code f} is not sampled at the upper bound {@code max}.\n     *\n     * @param f Function to be sampled\n     * @param min Lower bound of the interval (included).\n     * @param max Upper bound of the interval (excluded).\n     * @param n Number of sample points.\n     * @return the array of samples.\n     * @throws NumberIsTooLargeException if the lower bound {@code min} is\n     * greater than, or equal to the upper bound {@code max}.\n     * @throws NotStrictlyPositiveException if the number of sample points\n     * {@code n} is negative.\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 41)",
        "(line 434,col 9)-(line 434,col 41)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction)",
      "begin_line": 447,
      "end_line": 467,
      "comment": " Convert a {@link UnivariateDifferentiableFunction} into a {@link DifferentiableUnivariateFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 466,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-21f5e249-e05d-457d-bbfe-a2e48e0affc0.value(double)",
      "begin_line": 452,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 453,col 17)-(line 453,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f43008d1-950d-4064-b792-9e5cfcd33b35.derivative()",
      "begin_line": 457,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 17)-(line 463,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-79022c9e-b199-4716-ac40-6fc69d54ccf8.value(double)",
      "begin_line": 460,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 25)-(line 461,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toUnivariateDifferential(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction)",
      "begin_line": 479,
      "end_line": 515,
      "comment": " Convert a {@link DifferentiableUnivariateFunction} into a {@link UnivariateDifferentiableFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} up to order one.\n     * If the function is called with higher order, a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 514,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-411dc724-d241-4d4c-a2c0-a3cacac43bf3.value(double)",
      "begin_line": 484,
      "end_line": 486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 485,col 17)-(line 485,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9947c624-2109-4dc1-a9ff-83e4063d58ba.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 491,
      "end_line": 512,
      "comment": " {@inheritDoc}\n             * @exception NumberIsTooLargeException if derivation order is greater than 1\n             ",
      "child_ranges": [
        "(line 493,col 17)-(line 511,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction)",
      "begin_line": 523,
      "end_line": 588,
      "comment": " Convert a {@link MultivariateDifferentiableFunction} into a {@link DifferentiableMultivariateFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 587,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-8802ffea-bd55-4dcc-b882-babb090f08ff.value(double[])",
      "begin_line": 528,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 529,col 17)-(line 529,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-506a01e7-babf-477a-b6ec-0aba099690e1.partialDerivative(int)",
      "begin_line": 533,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 17)-(line 555,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-2521bd4a-1776-4e8c-bc26-7ed672d6b57c.value(double[])",
      "begin_line": 536,
      "end_line": 554,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 25)-(line 538,col 47)",
        "(line 541,col 25)-(line 541,col 85)",
        "(line 542,col 25)-(line 548,col 25)",
        "(line 549,col 25)-(line 549,col 67)",
        "(line 552,col 25)-(line 552,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-d3bf27d0-85f8-4ad1-8135-05872a299b67.gradient()",
      "begin_line": 558,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 559,col 17)-(line 584,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-83e19f1f-2209-427d-a71f-f84a9a0bddea.value(double[])",
      "begin_line": 561,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 563,col 25)-(line 563,col 47)",
        "(line 566,col 25)-(line 566,col 85)",
        "(line 567,col 25)-(line 569,col 25)",
        "(line 570,col 25)-(line 570,col 67)",
        "(line 573,col 25)-(line 573,col 64)",
        "(line 574,col 25)-(line 574,col 56)",
        "(line 575,col 25)-(line 579,col 25)",
        "(line 581,col 25)-(line 581,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateFunction)",
      "begin_line": 602,
      "end_line": 662,
      "comment": " Convert a {@link DifferentiableMultivariateFunction} into a {@link MultivariateDifferentiableFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} elements\n     * that all have the same number of free parameters and order, and with order at most 1.\n     * If the function is called with inconsistent numbers of free parameters or higher order, a\n     * {@link DimensionMismatchException} or a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 661,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-d557ef52-f25e-4042-9952-9c53f0ceafad.value(double[])",
      "begin_line": 607,
      "end_line": 609,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 608,col 17)-(line 608,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ab9bbde8-5936-4107-9964-08a986c99b6d.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 615,
      "end_line": 659,
      "comment": " {@inheritDoc}\n             * @exception DimensionMismatchException if number of parameters or derivation\n             * order are higher than 1\n             ",
      "child_ranges": [
        "(line 619,col 17)-(line 619,col 64)",
        "(line 620,col 17)-(line 620,col 55)",
        "(line 621,col 17)-(line 621,col 48)",
        "(line 622,col 17)-(line 624,col 17)",
        "(line 627,col 17)-(line 635,col 17)",
        "(line 638,col 17)-(line 638,col 53)",
        "(line 639,col 17)-(line 641,col 17)",
        "(line 642,col 17)-(line 642,col 57)",
        "(line 643,col 17)-(line 643,col 68)",
        "(line 646,col 17)-(line 646,col 72)",
        "(line 647,col 17)-(line 647,col 39)",
        "(line 648,col 17)-(line 648,col 57)",
        "(line 649,col 17)-(line 655,col 17)",
        "(line 657,col 17)-(line 657,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)",
      "begin_line": 670,
      "end_line": 711,
      "comment": " Convert a {@link MultivariateDifferentiableVectorFunction} into a {@link DifferentiableMultivariateVectorFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateVectorFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 710,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-805c7b68-59c1-4141-bb0a-9579b76bf415.value(double[])",
      "begin_line": 675,
      "end_line": 677,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 17)-(line 676,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c9dfde6a-e9b9-4968-b223-f1483effd447.jacobian()",
      "begin_line": 679,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 680,col 17)-(line 707,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-facff41b-f635-45b1-91cc-298b0a51533f.value(double[])",
      "begin_line": 682,
      "end_line": 706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 684,col 25)-(line 684,col 47)",
        "(line 687,col 25)-(line 687,col 85)",
        "(line 688,col 25)-(line 690,col 25)",
        "(line 691,col 25)-(line 691,col 69)",
        "(line 694,col 25)-(line 694,col 76)",
        "(line 695,col 25)-(line 695,col 56)",
        "(line 696,col 25)-(line 702,col 25)",
        "(line 704,col 25)-(line 704,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)",
      "begin_line": 725,
      "end_line": 789,
      "comment": " Convert a {@link DifferentiableMultivariateVectorFunction} into a {@link MultivariateDifferentiableVectorFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} elements\n     * that all have the same number of free parameters and order, and with order at most 1.\n     * If the function is called with inconsistent numbers of free parameters or higher order, a\n     * {@link DimensionMismatchException} or a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 788,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-0a45a774-3b4f-49e9-a376-ce8b0b4ff0d2.value(double[])",
      "begin_line": 730,
      "end_line": 732,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 731,col 17)-(line 731,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-438dfb1c-8a37-4d3e-80e0-cfa3332eb7d1.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 738,
      "end_line": 786,
      "comment": " {@inheritDoc}\n             * @exception DimensionMismatchException if number of parameters or derivation\n             * order are higher than 1\n             ",
      "child_ranges": [
        "(line 742,col 17)-(line 742,col 64)",
        "(line 743,col 17)-(line 743,col 55)",
        "(line 744,col 17)-(line 744,col 48)",
        "(line 745,col 17)-(line 747,col 17)",
        "(line 750,col 17)-(line 758,col 17)",
        "(line 761,col 17)-(line 761,col 53)",
        "(line 762,col 17)-(line 764,col 17)",
        "(line 765,col 17)-(line 765,col 59)",
        "(line 766,col 17)-(line 766,col 70)",
        "(line 769,col 17)-(line 769,col 91)",
        "(line 770,col 17)-(line 782,col 17)",
        "(line 784,col 17)-(line 784,col 30)"
      ]
    }
  ]
}