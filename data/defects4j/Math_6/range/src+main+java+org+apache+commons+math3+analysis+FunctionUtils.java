{
  "filepath": "/tmp/Math-6b/src/main/java/org/apache/commons/math3/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 794,
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-68e78085-1189-4907-9075-535d0a83b65b.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9daab52d-bbb3-4f31-83bb-9c3b6114f5a7.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ff1217bb-406a-47c7-a83b-2d36f8fe9868.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-e14aca27-f4f9-4ff8-b6b2-0e94709a8ad0.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ba2d8a0c-95be-4263-b025-e6afb287316b.derivative()",
      "begin_line": 120,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 17)-(line 132,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-86f0a691-5b08-4d75-86d6-92655175ea2e.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-81e42a30-e440-48e4-bec0-b5a25558ca82.value(double)",
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
      "end_line": 188,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 187,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c5bc3137-d420-4a3b-bf2e-8dadf8d097a3.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-bfbd9628-2e8d-48f4-8f68-afce34a9c1de.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 178,
      "end_line": 185,
      "comment": " {@inheritDoc}\n             * @throws DimensionMismatchException if functions are not consistent with each other\n             ",
      "child_ranges": [
        "(line 180,col 17)-(line 180,col 54)",
        "(line 181,col 17)-(line 183,col 17)",
        "(line 184,col 17)-(line 184,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 197,
      "end_line": 223,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @deprecated as of 3.1 replaced by {@link #add(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 222,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-2fc4098f-3e3e-4c38-bf8c-6c77c522f235.value(double)",
      "begin_line": 201,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 17)-(line 202,col 41)",
        "(line 203,col 17)-(line 205,col 17)",
        "(line 206,col 17)-(line 206,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-e54c0386-4f3e-4b86-80da-4b42e3ccff86.derivative()",
      "begin_line": 210,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 17)-(line 220,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f99f20bc-d56f-4ccc-a0c3-3f0f079ca6ab.value(double)",
      "begin_line": 213,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 25)-(line 214,col 62)",
        "(line 215,col 25)-(line 217,col 25)",
        "(line 218,col 25)-(line 218,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 231,
      "end_line": 242,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 241,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-55ca12b1-7a75-4985-8ec5-4a7fa61586eb.value(double)",
      "begin_line": 234,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 17)-(line 235,col 41)",
        "(line 236,col 17)-(line 238,col 17)",
        "(line 239,col 17)-(line 239,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 251,
      "end_line": 273,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 272,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4b9d0263-82d8-45b6-b7ae-5194c81bc0b1.value(double)",
      "begin_line": 255,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 17)-(line 256,col 41)",
        "(line 257,col 17)-(line 259,col 17)",
        "(line 260,col 17)-(line 260,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-aa965d40-5887-4f43-a452-3dcffab6925f.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 264,
      "end_line": 270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 265,col 17)-(line 265,col 54)",
        "(line 266,col 17)-(line 268,col 17)",
        "(line 269,col 17)-(line 269,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 282,
      "end_line": 313,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @deprecated as of 3.1 replaced by {@link #multiply(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 312,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-82894682-e1db-439a-a87a-cce2e31ce19c.value(double)",
      "begin_line": 285,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 286,col 17)-(line 286,col 41)",
        "(line 287,col 17)-(line 289,col 17)",
        "(line 290,col 17)-(line 290,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-8ba30e67-0ccd-4d63-8796-0370f53d0820.derivative()",
      "begin_line": 294,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 17)-(line 310,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4ce5ce4d-4eac-4841-9b32-4721c733ec47.value(double)",
      "begin_line": 297,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 25)-(line 298,col 39)",
        "(line 299,col 25)-(line 307,col 25)",
        "(line 308,col 25)-(line 308,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.combine(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 324,
      "end_line": 333,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 332,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-e5f0ec6c-f1d8-44ba-8879-31ecd5862d32.value(double)",
      "begin_line": 329,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 17)-(line 330,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, double)",
      "begin_line": 345,
      "end_line": 358,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 357,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9682809a-70a7-4146-a2da-9e8baa22454f.value(double[])",
      "begin_line": 350,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 17)-(line 351,col 80)",
        "(line 352,col 17)-(line 354,col 17)",
        "(line 355,col 17)-(line 355,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 369,
      "end_line": 372,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 381,
      "end_line": 389,
      "comment": "\n     * Creates a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 388,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9f803003-802b-4afe-87ed-049175e86fa6.value(double)",
      "begin_line": 385,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 17)-(line 386,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 397,
      "end_line": 405,
      "comment": "\n     * Creates a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 404,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-8bb3eba6-5bee-498d-84bc-fcb6d50a091b.value(double)",
      "begin_line": 401,
      "end_line": 403,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 17)-(line 402,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.sample(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 424,
      "end_line": 442,
      "comment": "\n     * Samples the specified univariate real function on the specified interval.\n     * \u003cbr/\u003e\n     * The interval is divided equally into {@code n} sections and sample points\n     * are taken from {@code min} to {@code max - (max - min) / n}; therefore\n     * {@code f} is not sampled at the upper bound {@code max}.\n     *\n     * @param f Function to be sampled\n     * @param min Lower bound of the interval (included).\n     * @param max Upper bound of the interval (excluded).\n     * @param n Number of sample points.\n     * @return the array of samples.\n     * @throws NumberIsTooLargeException if the lower bound {@code min} is\n     * greater than, or equal to the upper bound {@code max}.\n     * @throws NotStrictlyPositiveException if the number of sample points\n     * {@code n} is negative.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 41)",
        "(line 437,col 9)-(line 437,col 41)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction)",
      "begin_line": 450,
      "end_line": 470,
      "comment": " Convert a {@link UnivariateDifferentiableFunction} into a {@link DifferentiableUnivariateFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 469,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-0e64702a-08ac-4087-b5a3-94c4575f7132.value(double)",
      "begin_line": 455,
      "end_line": 457,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 17)-(line 456,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-dc6ec530-c0f7-4ae9-abe8-feea851ea693.derivative()",
      "begin_line": 460,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 17)-(line 466,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-fdf38ecb-a749-4dff-9774-919b32ffead9.value(double)",
      "begin_line": 463,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 464,col 25)-(line 464,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toUnivariateDifferential(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction)",
      "begin_line": 482,
      "end_line": 518,
      "comment": " Convert a {@link DifferentiableUnivariateFunction} into a {@link UnivariateDifferentiableFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} up to order one.\n     * If the function is called with higher order, a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 517,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-8b2e4741-0c97-4e49-8b96-61c10e065f78.value(double)",
      "begin_line": 487,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 17)-(line 488,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4781a699-c7e4-470c-b30b-c92e66c88a5c.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 494,
      "end_line": 515,
      "comment": " {@inheritDoc}\n             * @exception NumberIsTooLargeException if derivation order is greater than 1\n             ",
      "child_ranges": [
        "(line 496,col 17)-(line 514,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction)",
      "begin_line": 526,
      "end_line": 591,
      "comment": " Convert a {@link MultivariateDifferentiableFunction} into a {@link DifferentiableMultivariateFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 590,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-857c4ea8-e43c-4185-a958-5b2acf9f2550.value(double[])",
      "begin_line": 531,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 532,col 17)-(line 532,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4b8adb45-96fe-46d6-9889-108d9da8c455.partialDerivative(int)",
      "begin_line": 536,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 17)-(line 558,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-0e2f5e6c-be3c-4fe1-b2bb-34f579324881.value(double[])",
      "begin_line": 539,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 541,col 25)-(line 541,col 47)",
        "(line 544,col 25)-(line 544,col 85)",
        "(line 545,col 25)-(line 551,col 25)",
        "(line 552,col 25)-(line 552,col 67)",
        "(line 555,col 25)-(line 555,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a8fa09f6-1456-4a6b-a73d-07edea36283d.gradient()",
      "begin_line": 561,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 562,col 17)-(line 587,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-cf973e38-6341-402c-b3ad-f3bf97170419.value(double[])",
      "begin_line": 564,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 566,col 25)-(line 566,col 47)",
        "(line 569,col 25)-(line 569,col 85)",
        "(line 570,col 25)-(line 572,col 25)",
        "(line 573,col 25)-(line 573,col 67)",
        "(line 576,col 25)-(line 576,col 64)",
        "(line 577,col 25)-(line 577,col 56)",
        "(line 578,col 25)-(line 582,col 25)",
        "(line 584,col 25)-(line 584,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateFunction)",
      "begin_line": 605,
      "end_line": 665,
      "comment": " Convert a {@link DifferentiableMultivariateFunction} into a {@link MultivariateDifferentiableFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} elements\n     * that all have the same number of free parameters and order, and with order at most 1.\n     * If the function is called with inconsistent numbers of free parameters or higher order, a\n     * {@link DimensionMismatchException} or a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 664,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-47ee192d-7a82-4d36-84be-7fefb5c4c34b.value(double[])",
      "begin_line": 610,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 17)-(line 611,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-51dc82b8-97bf-4710-b1de-788708a4fa52.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 618,
      "end_line": 662,
      "comment": " {@inheritDoc}\n             * @exception NumberIsTooLargeException if derivation order is higher than 1\n             * @exception DimensionMismatchException if numbers of free parameters are inconsistent\n             ",
      "child_ranges": [
        "(line 622,col 17)-(line 622,col 64)",
        "(line 623,col 17)-(line 623,col 55)",
        "(line 624,col 17)-(line 624,col 48)",
        "(line 625,col 17)-(line 627,col 17)",
        "(line 630,col 17)-(line 638,col 17)",
        "(line 641,col 17)-(line 641,col 53)",
        "(line 642,col 17)-(line 644,col 17)",
        "(line 645,col 17)-(line 645,col 57)",
        "(line 646,col 17)-(line 646,col 68)",
        "(line 649,col 17)-(line 649,col 72)",
        "(line 650,col 17)-(line 650,col 39)",
        "(line 651,col 17)-(line 651,col 57)",
        "(line 652,col 17)-(line 658,col 17)",
        "(line 660,col 17)-(line 660,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)",
      "begin_line": 673,
      "end_line": 714,
      "comment": " Convert a {@link MultivariateDifferentiableVectorFunction} into a {@link DifferentiableMultivariateVectorFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateVectorFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 713,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c450b525-f429-4f7e-8a58-fddda6488748.value(double[])",
      "begin_line": 678,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 679,col 17)-(line 679,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-133db6bd-3dd9-4a6a-ad93-ca15697a1241.jacobian()",
      "begin_line": 682,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 683,col 17)-(line 710,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c7229a83-d9d3-4502-8a11-87b37922c0ac.value(double[])",
      "begin_line": 685,
      "end_line": 709,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 687,col 25)-(line 687,col 47)",
        "(line 690,col 25)-(line 690,col 85)",
        "(line 691,col 25)-(line 693,col 25)",
        "(line 694,col 25)-(line 694,col 69)",
        "(line 697,col 25)-(line 697,col 76)",
        "(line 698,col 25)-(line 698,col 56)",
        "(line 699,col 25)-(line 705,col 25)",
        "(line 707,col 25)-(line 707,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)",
      "begin_line": 728,
      "end_line": 792,
      "comment": " Convert a {@link DifferentiableMultivariateVectorFunction} into a {@link MultivariateDifferentiableVectorFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} elements\n     * that all have the same number of free parameters and order, and with order at most 1.\n     * If the function is called with inconsistent numbers of free parameters or higher order, a\n     * {@link DimensionMismatchException} or a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 791,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-460c5b58-344e-409f-98af-2d35f4ac62f8.value(double[])",
      "begin_line": 733,
      "end_line": 735,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 734,col 17)-(line 734,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-bcb65924-1dda-4fcd-92e1-1bb755642b31.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 741,
      "end_line": 789,
      "comment": " {@inheritDoc}\n             * @exception NumberIsTooLargeException if derivation order is higher than 1\n             * @exception DimensionMismatchException if numbers of free parameters are inconsistent\n             ",
      "child_ranges": [
        "(line 745,col 17)-(line 745,col 64)",
        "(line 746,col 17)-(line 746,col 55)",
        "(line 747,col 17)-(line 747,col 48)",
        "(line 748,col 17)-(line 750,col 17)",
        "(line 753,col 17)-(line 761,col 17)",
        "(line 764,col 17)-(line 764,col 53)",
        "(line 765,col 17)-(line 767,col 17)",
        "(line 768,col 17)-(line 768,col 59)",
        "(line 769,col 17)-(line 769,col 70)",
        "(line 772,col 17)-(line 772,col 91)",
        "(line 773,col 17)-(line 785,col 17)",
        "(line 787,col 17)-(line 787,col 30)"
      ]
    }
  ]
}