{
  "filepath": "/tmp/Math-8b/src/main/java/org/apache/commons/math3/analysis/FunctionUtils.java",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-5b4f9857-6d19-466c-a3cd-762a9233b0c6.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-80faccd0-de72-4a09-87d3-3b15ce970623.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-add1bc8e-9639-46b7-a0f6-6bfd3b5f72a6.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-0808de54-d9bd-4a3a-8a2f-8a33218ce090.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-6f6cfb63-c19e-474b-b4fd-1f4a19cc8263.derivative()",
      "begin_line": 120,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 17)-(line 132,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a4dea2c2-d868-4208-8af4-ea5a6e2cdb41.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a77c7980-2f14-4911-8e85-23e489d549aa.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-72be1c3f-30a9-47dc-a809-e4a88dea9f08.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4fb7528e-0abe-48cb-8843-b646c364ebc4.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-2c551e43-0e22-45f2-9453-6ce0c2be2011.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ef710f69-7de7-4cfe-997e-b880a3bbc0d3.derivative()",
      "begin_line": 207,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 17)-(line 217,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-96dab81b-0b77-438f-abd6-e68d9d03290c.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-5cde07b2-c046-48d7-b965-249b39af67bc.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-38047e89-1073-4a6b-8248-b933c5b904d1.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-2a66024b-cdce-4d9f-a53e-125b8d7575ec.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7b76f8cf-cec6-4869-b242-55e825e38707.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-46a91298-4e55-4930-b12b-9b4b8a2d8c3a.derivative()",
      "begin_line": 291,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 17)-(line 307,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-6dcf4ffa-cf05-4bcd-855a-34e3eda35408.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-696e3057-7cf5-4cb7-92a9-0eb6567e8519.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7588e2b6-3bf1-493e-937d-277ff2eb7186.value(double[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-46a18496-e8c0-47bb-8eb7-169a5a2df4b7.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-473f54aa-6021-4f18-ad05-b55cd939e024.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4f9f4a80-5b3b-4fb7-a620-fa5b682c365b.value(double)",
      "begin_line": 452,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 453,col 17)-(line 453,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a5374529-43c9-4efe-b5a4-03b0d196ef14.derivative()",
      "begin_line": 457,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 17)-(line 463,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-5808cd82-5125-4452-9788-02d65d84be6a.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f5068852-0899-47a0-ba6f-4dd876d64828.value(double)",
      "begin_line": 484,
      "end_line": 486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 485,col 17)-(line 485,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-edbfbd18-7fa6-494b-928b-43f62c9fcf71.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a5bd3891-2b09-4ac0-93c4-f8de03d5b1e9.value(double[])",
      "begin_line": 528,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 529,col 17)-(line 529,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-034849a2-1096-47a5-8da1-676def019851.partialDerivative(int)",
      "begin_line": 533,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 17)-(line 555,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4bffe7ec-5a5d-47a4-9da6-35c8e60b862f.value(double[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a960949a-8a70-4c98-bb88-b5cd6cc4c18c.gradient()",
      "begin_line": 558,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 559,col 17)-(line 584,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-fa923dd4-36b4-4e4b-b1dd-252442e1c694.value(double[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1df0a453-189f-4ef4-b90d-12fd2130e27d.value(double[])",
      "begin_line": 607,
      "end_line": 609,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 608,col 17)-(line 608,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-728c2fc6-ea73-43fe-87d9-77d9ac22b410.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a2931c8e-0045-485b-95fe-89fbf2a6d50e.value(double[])",
      "begin_line": 675,
      "end_line": 677,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 17)-(line 676,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c4c96225-db95-4921-8a27-a1e8d2f4e245.jacobian()",
      "begin_line": 679,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 680,col 17)-(line 707,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c5500e28-debb-4a9d-a9af-485c4ba4a4f9.value(double[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-139b9edb-b9d8-4faa-8a7f-df8389744910.value(double[])",
      "begin_line": 730,
      "end_line": 732,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 731,col 17)-(line 731,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-acbbe5b4-e3e9-4d7f-abf5-f3b2ce2ab03c.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
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