{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/FunctionUtils.java",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ecf8b8f9-8667-4758-af01-4a0521447896.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-3cdac776-867e-4194-b2df-1a4fc99c4088.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-39e58076-a8c4-4312-b41b-e1f79429bd84.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-58b13488-a35b-49e1-892e-69d2f877645e.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-7b8de0df-bd3f-4bf8-86c3-747184436031.derivative()",
      "begin_line": 120,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 17)-(line 132,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ece3b0a8-84ba-4520-b7a7-3fc46bff8358.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-dd288376-6093-4b70-9ed5-85858a3fd901.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-579b2a0e-4bdc-49f6-8984-d3a6656a94d4.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-34d97161-74e5-4c85-9d58-1b01581bca87.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-464af41c-c298-416e-8bdf-b8aa8854e8a1.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-10189936-8690-46b4-beed-5cae7d6d61fa.derivative()",
      "begin_line": 210,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 17)-(line 220,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-53aec75f-15d3-4539-99a9-a314d6c20ee7.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a586b7e2-6825-4b7c-93ed-b98f53ce996e.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-71d92598-0f97-436d-ad2b-b0957fd73076.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9dbd350e-b70d-4849-af53-4ac9a0146c00.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ea95f8f1-1af0-48ab-b213-4152a8870990.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ae584914-2812-4afa-99b3-cb8905c56c1d.derivative()",
      "begin_line": 294,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 17)-(line 310,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-30b26389-8cdf-45c3-9e76-a0b55e25ec2d.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-b65fc10e-7e7b-40ae-8307-ed8800de775d.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-70d42b1a-7d6b-4ff2-812b-9585538d5329.value(double[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-048c5c34-28cd-4242-8a22-6c9568533adb.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-8e368a42-4f06-462b-be18-443bcb838bdb.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ca4e0e2c-c92e-41bb-91c0-2b6057957505.value(double)",
      "begin_line": 455,
      "end_line": 457,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 17)-(line 456,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-0a4e9163-0cbc-4d8c-be55-7e5c473f477e.derivative()",
      "begin_line": 460,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 17)-(line 466,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ae3a0634-77e5-4bd1-a185-e6e27bd2145b.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-8ba05f42-ad72-46ae-ad52-8665f44ae49d.value(double)",
      "begin_line": 487,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 17)-(line 488,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-cc86904e-a295-4516-a8ef-cf105e742b44.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-377becad-a3bc-4042-8b49-555707c9a186.value(double[])",
      "begin_line": 531,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 532,col 17)-(line 532,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-d6bb9e6b-0eda-4b19-b9fc-53081f34e4ed.partialDerivative(int)",
      "begin_line": 536,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 17)-(line 558,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-64edd2b6-b496-4ada-ad8d-fcdbb2e474e7.value(double[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-797689dd-6904-4983-92df-ca894802dea6.gradient()",
      "begin_line": 561,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 562,col 17)-(line 587,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-0ddd415f-1ebe-4ae6-95de-54a998bcdb74.value(double[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-80849b45-f65b-4358-a25a-66c8181f36e6.value(double[])",
      "begin_line": 610,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 17)-(line 611,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-013272d2-8758-4f31-87fd-baaac53a7f65.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-802b64a6-9474-4a2b-8990-e8568f6e0ffd.value(double[])",
      "begin_line": 678,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 679,col 17)-(line 679,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-fb2b91f5-63dc-4b94-83eb-97aba7802d5d.jacobian()",
      "begin_line": 682,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 683,col 17)-(line 710,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-f5e94ff0-d45b-4302-9df8-fa133e783524.value(double[])",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ef5de0da-3739-422f-901b-bb2d03ed84c9.value(double[])",
      "begin_line": 733,
      "end_line": 735,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 734,col 17)-(line 734,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a48c5431-632a-49c1-8e4a-c6accb213ec0.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
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