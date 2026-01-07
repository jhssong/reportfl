{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 796,
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7219ce71-ef80-43e7-9acb-b2b8c3a79ae5.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-fd1c75e7-89d7-4c83-88b2-2f0da2fbf0bc.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1344cf67-3c31-4aa5-ab86-c4e65b450972.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "end_line": 136,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     * @deprecated as of 3.1 replaced by {@link #compose(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 135,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-2d3fc6c1-3fcc-4cce-acf3-6be210be758a.value(double)",
      "begin_line": 112,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 17)-(line 113,col 29)",
        "(line 114,col 17)-(line 116,col 17)",
        "(line 117,col 17)-(line 117,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1ebd1a79-367a-4f33-88d6-78e16e5bce66.derivative()",
      "begin_line": 121,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 17)-(line 133,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-183b3df3-a122-4eb3-a44f-5296fbf10bea.value(double)",
      "begin_line": 124,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 25)-(line 125,col 37)",
        "(line 126,col 25)-(line 126,col 37)",
        "(line 127,col 25)-(line 130,col 25)",
        "(line 131,col 25)-(line 131,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 154,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c5b43ff8-23e2-494b-a4eb-fd515f562011.value(double)",
      "begin_line": 147,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 17)-(line 148,col 41)",
        "(line 149,col 17)-(line 151,col 17)",
        "(line 152,col 17)-(line 152,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 164,
      "end_line": 189,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 188,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-b9ad2a37-6ddd-49a9-8efd-936eb5468d62.value(double)",
      "begin_line": 168,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 17)-(line 169,col 41)",
        "(line 170,col 17)-(line 172,col 17)",
        "(line 173,col 17)-(line 173,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4776d111-4486-49bd-97d9-01e5adc8ac1a.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 179,
      "end_line": 186,
      "comment": " {@inheritDoc}\n             * @throws DimensionMismatchException if functions are not consistent with each other\n             ",
      "child_ranges": [
        "(line 181,col 17)-(line 181,col 54)",
        "(line 182,col 17)-(line 184,col 17)",
        "(line 185,col 17)-(line 185,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 198,
      "end_line": 224,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @deprecated as of 3.1 replaced by {@link #add(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 223,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7a42b1b7-d257-4392-a4ee-dfc5025e9941.value(double)",
      "begin_line": 202,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 17)-(line 203,col 41)",
        "(line 204,col 17)-(line 206,col 17)",
        "(line 207,col 17)-(line 207,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1be3d8c0-6de1-4589-b3a4-5d5429346e41.derivative()",
      "begin_line": 211,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 17)-(line 221,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-57bd2fb4-60ce-4296-8e78-9ebd6ebc38f8.value(double)",
      "begin_line": 214,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 25)-(line 215,col 62)",
        "(line 216,col 25)-(line 218,col 25)",
        "(line 219,col 25)-(line 219,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 232,
      "end_line": 243,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 242,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-3030c742-725f-4e43-bc71-309bb5279cc7.value(double)",
      "begin_line": 235,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 17)-(line 236,col 41)",
        "(line 237,col 17)-(line 239,col 17)",
        "(line 240,col 17)-(line 240,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction...)",
      "begin_line": 252,
      "end_line": 274,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 273,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-15963b88-3280-49eb-99ec-bc46cbfb27df.value(double)",
      "begin_line": 256,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 17)-(line 257,col 41)",
        "(line 258,col 17)-(line 260,col 17)",
        "(line 261,col 17)-(line 261,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-615e5193-6643-4d11-92f7-ef34d7b7d64c.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 265,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 17)-(line 266,col 54)",
        "(line 267,col 17)-(line 269,col 17)",
        "(line 270,col 17)-(line 270,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 283,
      "end_line": 315,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @deprecated as of 3.1 replaced by {@link #multiply(UnivariateDifferentiableFunction...)}\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 314,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-2c862cd9-198c-4337-934e-91441e1c29a2.value(double)",
      "begin_line": 287,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 17)-(line 288,col 41)",
        "(line 289,col 17)-(line 291,col 17)",
        "(line 292,col 17)-(line 292,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-b3ba7052-13b2-4dc2-982b-2bba889ad9aa.derivative()",
      "begin_line": 296,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 17)-(line 312,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-00c92944-8e63-4e57-a96d-22aa51a02226.value(double)",
      "begin_line": 299,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 300,col 25)-(line 300,col 39)",
        "(line 301,col 25)-(line 309,col 25)",
        "(line 310,col 25)-(line 310,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.combine(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 326,
      "end_line": 335,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 334,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-546f572d-2cb6-479f-bbd2-6592bc739c02.value(double)",
      "begin_line": 331,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 17)-(line 332,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, double)",
      "begin_line": 347,
      "end_line": 360,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 359,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-e4d205da-d50b-4314-9717-15510ee69932.value(double[])",
      "begin_line": 352,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 17)-(line 353,col 80)",
        "(line 354,col 17)-(line 356,col 17)",
        "(line 357,col 17)-(line 357,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 371,
      "end_line": 374,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 383,
      "end_line": 391,
      "comment": "\n     * Creates a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 390,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-608d69a3-ca34-403b-b78b-af56b63eff28.value(double)",
      "begin_line": 387,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 388,col 17)-(line 388,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 399,
      "end_line": 407,
      "comment": "\n     * Creates a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 406,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-81e9e5d0-c810-41d3-9f00-b4f22197d5e9.value(double)",
      "begin_line": 403,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 17)-(line 404,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.sample(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 426,
      "end_line": 444,
      "comment": "\n     * Samples the specified univariate real function on the specified interval.\n     * \u003cbr/\u003e\n     * The interval is divided equally into {@code n} sections and sample points\n     * are taken from {@code min} to {@code max - (max - min) / n}; therefore\n     * {@code f} is not sampled at the upper bound {@code max}.\n     *\n     * @param f Function to be sampled\n     * @param min Lower bound of the interval (included).\n     * @param max Upper bound of the interval (excluded).\n     * @param n Number of sample points.\n     * @return the array of samples.\n     * @throws NumberIsTooLargeException if the lower bound {@code min} is\n     * greater than, or equal to the upper bound {@code max}.\n     * @throws NotStrictlyPositiveException if the number of sample points\n     * {@code n} is negative.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 438,col 41)",
        "(line 439,col 9)-(line 439,col 41)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction)",
      "begin_line": 452,
      "end_line": 472,
      "comment": " Convert a {@link UnivariateDifferentiableFunction} into a {@link DifferentiableUnivariateFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 471,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-15538e15-0805-486c-9587-8a1f77a9d6d5.value(double)",
      "begin_line": 457,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 17)-(line 458,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-70648e18-aebe-4700-a0a0-31d01145848d.derivative()",
      "begin_line": 462,
      "end_line": 469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 17)-(line 468,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-93816136-1eec-4caf-8621-ec1ade0a9c5c.value(double)",
      "begin_line": 465,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 466,col 25)-(line 466,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toUnivariateDifferential(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction)",
      "begin_line": 484,
      "end_line": 520,
      "comment": " Convert a {@link DifferentiableUnivariateFunction} into a {@link UnivariateDifferentiableFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} up to order one.\n     * If the function is called with higher order, a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 519,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7381f72b-58d8-49db-b746-a0d8da2645c0.value(double)",
      "begin_line": 489,
      "end_line": 491,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 490,col 17)-(line 490,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-b6d0a0ab-bf4b-42bb-b5c1-5f502cb79d04.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 496,
      "end_line": 517,
      "comment": " {@inheritDoc}\n             * @exception NumberIsTooLargeException if derivation order is greater than 1\n             ",
      "child_ranges": [
        "(line 498,col 17)-(line 516,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction)",
      "begin_line": 528,
      "end_line": 593,
      "comment": " Convert a {@link MultivariateDifferentiableFunction} into a {@link DifferentiableMultivariateFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 592,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-6842459a-9338-4bb0-86a9-b4c2f086c816.value(double[])",
      "begin_line": 533,
      "end_line": 535,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 17)-(line 534,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1d6149a0-4fe8-4e52-9fd3-a36a6adba923.partialDerivative(int)",
      "begin_line": 538,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 17)-(line 560,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1847b8a8-de7f-44b7-99b1-6db81a63b8fa.value(double[])",
      "begin_line": 541,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 543,col 25)-(line 543,col 47)",
        "(line 546,col 25)-(line 546,col 85)",
        "(line 547,col 25)-(line 553,col 25)",
        "(line 554,col 25)-(line 554,col 67)",
        "(line 557,col 25)-(line 557,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-daeb6cee-a75c-4c3b-b14b-f3894f082752.gradient()",
      "begin_line": 563,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 564,col 17)-(line 589,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c5da1360-c309-46bc-8d2c-7856fad34048.value(double[])",
      "begin_line": 566,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 568,col 25)-(line 568,col 47)",
        "(line 571,col 25)-(line 571,col 85)",
        "(line 572,col 25)-(line 574,col 25)",
        "(line 575,col 25)-(line 575,col 67)",
        "(line 578,col 25)-(line 578,col 64)",
        "(line 579,col 25)-(line 579,col 56)",
        "(line 580,col 25)-(line 584,col 25)",
        "(line 586,col 25)-(line 586,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateFunction)",
      "begin_line": 607,
      "end_line": 667,
      "comment": " Convert a {@link DifferentiableMultivariateFunction} into a {@link MultivariateDifferentiableFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} elements\n     * that all have the same number of free parameters and order, and with order at most 1.\n     * If the function is called with inconsistent numbers of free parameters or higher order, a\n     * {@link DimensionMismatchException} or a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 666,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-db438676-39fe-4179-b16b-9d49709be996.value(double[])",
      "begin_line": 612,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 613,col 17)-(line 613,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ba1dd81a-11f9-4128-bfd8-d477fe8d4268.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 620,
      "end_line": 664,
      "comment": " {@inheritDoc}\n             * @exception NumberIsTooLargeException if derivation order is higher than 1\n             * @exception DimensionMismatchException if numbers of free parameters are inconsistent\n             ",
      "child_ranges": [
        "(line 624,col 17)-(line 624,col 64)",
        "(line 625,col 17)-(line 625,col 55)",
        "(line 626,col 17)-(line 626,col 48)",
        "(line 627,col 17)-(line 629,col 17)",
        "(line 632,col 17)-(line 640,col 17)",
        "(line 643,col 17)-(line 643,col 53)",
        "(line 644,col 17)-(line 646,col 17)",
        "(line 647,col 17)-(line 647,col 57)",
        "(line 648,col 17)-(line 648,col 68)",
        "(line 651,col 17)-(line 651,col 72)",
        "(line 652,col 17)-(line 652,col 39)",
        "(line 653,col 17)-(line 653,col 57)",
        "(line 654,col 17)-(line 660,col 17)",
        "(line 662,col 17)-(line 662,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)",
      "begin_line": 675,
      "end_line": 716,
      "comment": " Convert a {@link MultivariateDifferentiableVectorFunction} into a {@link DifferentiableMultivariateVectorFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateVectorFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 715,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f8ce8c3c-ad55-4457-8ba6-ba735c8fb174.value(double[])",
      "begin_line": 680,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 681,col 17)-(line 681,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-88a8eb7e-554a-4da8-9677-5ddc9e4182c2.jacobian()",
      "begin_line": 684,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 685,col 17)-(line 712,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-b7af1057-316b-4ced-b5b2-2048459dca51.value(double[])",
      "begin_line": 687,
      "end_line": 711,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 689,col 25)-(line 689,col 47)",
        "(line 692,col 25)-(line 692,col 85)",
        "(line 693,col 25)-(line 695,col 25)",
        "(line 696,col 25)-(line 696,col 69)",
        "(line 699,col 25)-(line 699,col 76)",
        "(line 700,col 25)-(line 700,col 56)",
        "(line 701,col 25)-(line 707,col 25)",
        "(line 709,col 25)-(line 709,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)",
      "begin_line": 730,
      "end_line": 794,
      "comment": " Convert a {@link DifferentiableMultivariateVectorFunction} into a {@link MultivariateDifferentiableVectorFunction}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} elements\n     * that all have the same number of free parameters and order, and with order at most 1.\n     * If the function is called with inconsistent numbers of free parameters or higher order, a\n     * {@link DimensionMismatchException} or a {@link NumberIsTooLargeException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableMultivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 793,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-48929099-7aee-4e95-ac06-3f40dd75f15a.value(double[])",
      "begin_line": 735,
      "end_line": 737,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 736,col 17)-(line 736,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7f3e6a99-fff3-480a-97a1-b4e0cc7db0e3.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 743,
      "end_line": 791,
      "comment": " {@inheritDoc}\n             * @exception NumberIsTooLargeException if derivation order is higher than 1\n             * @exception DimensionMismatchException if numbers of free parameters are inconsistent\n             ",
      "child_ranges": [
        "(line 747,col 17)-(line 747,col 64)",
        "(line 748,col 17)-(line 748,col 55)",
        "(line 749,col 17)-(line 749,col 48)",
        "(line 750,col 17)-(line 752,col 17)",
        "(line 755,col 17)-(line 763,col 17)",
        "(line 766,col 17)-(line 766,col 53)",
        "(line 767,col 17)-(line 769,col 17)",
        "(line 770,col 17)-(line 770,col 59)",
        "(line 771,col 17)-(line 771,col 70)",
        "(line 774,col 17)-(line 774,col 91)",
        "(line 775,col 17)-(line 787,col 17)",
        "(line 789,col 17)-(line 789,col 30)"
      ]
    }
  ]
}