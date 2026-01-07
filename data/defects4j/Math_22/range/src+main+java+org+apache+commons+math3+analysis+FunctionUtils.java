{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 504,
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-31e7e5f2-c98f-42cb-b545-5a1dc223b0a0.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable...)",
      "begin_line": 72,
      "end_line": 94,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 93,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-b893b07d-d16d-43d3-a2a5-5099ba7d2a80.value(double)",
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
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-6e613167-4f72-471d-adc4-263fd3b349cb.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
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
      "begin_line": 105,
      "end_line": 132,
      "comment": "\n     * Composes functions.\n     * \u003cbr/\u003e\n     * The functions in the argument list are composed sequentially, in the\n     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 131,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-b26d9a24-cc7d-49cf-b508-9b8fdcfcbb28.value(double)",
      "begin_line": 108,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 17)-(line 109,col 29)",
        "(line 110,col 17)-(line 112,col 17)",
        "(line 113,col 17)-(line 113,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4b8d2703-748c-4b1a-b907-d0e9cc01ddc5.derivative()",
      "begin_line": 117,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 17)-(line 129,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-5827abb1-b3be-4845-89ac-b83d935f60a5.value(double)",
      "begin_line": 120,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 25)-(line 121,col 37)",
        "(line 122,col 25)-(line 122,col 37)",
        "(line 123,col 25)-(line 126,col 25)",
        "(line 127,col 25)-(line 127,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 140,
      "end_line": 151,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 150,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c2e534d2-8f5d-4aab-9ab6-ee93ec04f4dc.value(double)",
      "begin_line": 143,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 17)-(line 144,col 41)",
        "(line 145,col 17)-(line 147,col 17)",
        "(line 148,col 17)-(line 148,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable...)",
      "begin_line": 160,
      "end_line": 182,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 181,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a1c175ab-af6b-48ce-bd0b-ba16ae43bd3d.value(double)",
      "begin_line": 164,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 17)-(line 165,col 41)",
        "(line 166,col 17)-(line 168,col 17)",
        "(line 169,col 17)-(line 169,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-8d46a3da-5d7d-4e8f-ad03-cfabb3a603b8.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 173,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 17)-(line 174,col 54)",
        "(line 175,col 17)-(line 177,col 17)",
        "(line 178,col 17)-(line 178,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 190,
      "end_line": 215,
      "comment": "\n     * Adds functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 214,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ac0c800a-baba-4d5b-80ed-17542a9f94ad.value(double)",
      "begin_line": 193,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 194,col 17)-(line 194,col 41)",
        "(line 195,col 17)-(line 197,col 17)",
        "(line 198,col 17)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-d0132d32-5a9e-443b-8919-001214d86fb2.derivative()",
      "begin_line": 202,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 17)-(line 212,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-195cce4d-e4ec-4725-ac30-0e38d656f1b8.value(double)",
      "begin_line": 205,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 25)-(line 206,col 62)",
        "(line 207,col 25)-(line 209,col 25)",
        "(line 210,col 25)-(line 210,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 223,
      "end_line": 234,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 233,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-42c27e19-3764-487f-a1ce-b1eb7c896b9e.value(double)",
      "begin_line": 226,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 17)-(line 227,col 41)",
        "(line 228,col 17)-(line 230,col 17)",
        "(line 231,col 17)-(line 231,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable...)",
      "begin_line": 243,
      "end_line": 265,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 264,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9d2e8d7e-33a1-48fc-9397-f2cadaabaf45.value(double)",
      "begin_line": 247,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 248,col 17)-(line 248,col 41)",
        "(line 249,col 17)-(line 251,col 17)",
        "(line 252,col 17)-(line 252,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-cd67b3be-346c-4d7c-88cc-f0c9a9b9dd7a.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 256,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 17)-(line 257,col 54)",
        "(line 258,col 17)-(line 260,col 17)",
        "(line 261,col 17)-(line 261,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 273,
      "end_line": 304,
      "comment": "\n     * Multiplies functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 303,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-bf2683f6-3727-4828-8338-1264463e1603.value(double)",
      "begin_line": 276,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 17)-(line 277,col 41)",
        "(line 278,col 17)-(line 280,col 17)",
        "(line 281,col 17)-(line 281,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-74965f21-aa10-4583-bc85-99396687d864.derivative()",
      "begin_line": 285,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 286,col 17)-(line 301,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ac27aced-9602-4e54-a009-19d6fe491d12.value(double)",
      "begin_line": 288,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 25)-(line 289,col 39)",
        "(line 290,col 25)-(line 298,col 25)",
        "(line 299,col 25)-(line 299,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.combine(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 315,
      "end_line": 324,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 323,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9e30f879-58bf-470f-b82d-7798b73b0d7e.value(double)",
      "begin_line": 320,
      "end_line": 322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 17)-(line 321,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, double)",
      "begin_line": 336,
      "end_line": 349,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 348,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-9e9c2838-8d6e-4536-b256-bf6e8437489d.value(double[])",
      "begin_line": 341,
      "end_line": 347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 17)-(line 342,col 80)",
        "(line 343,col 17)-(line 345,col 17)",
        "(line 346,col 17)-(line 346,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 372,
      "end_line": 380,
      "comment": "\n     * Creates a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 379,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-14b416f8-1b1c-4847-9b54-e834fb153b57.value(double)",
      "begin_line": 376,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 17)-(line 377,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 388,
      "end_line": 396,
      "comment": "\n     * Creates a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 395,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-3e578c69-5049-46cc-a3d5-ed56284c5a44.value(double)",
      "begin_line": 392,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 17)-(line 393,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.sample(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 415,
      "end_line": 433,
      "comment": "\n     * Samples the specified univariate real function on the specified interval.\n     * \u003cbr/\u003e\n     * The interval is divided equally into {@code n} sections and sample points\n     * are taken from {@code min} to {@code max - (max - min) / n}; therefore\n     * {@code f} is not sampled at the upper bound {@code max}.\n     *\n     * @param f Function to be sampled\n     * @param min Lower bound of the interval (included).\n     * @param max Upper bound of the interval (excluded).\n     * @param n Number of sample points.\n     * @return the array of samples.\n     * @throws NumberIsTooLargeException if the lower bound {@code min} is\n     * greater than, or equal to the upper bound {@code max}.\n     * @throws NotStrictlyPositiveException if the number of sample points\n     * {@code n} is negative.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 427,col 41)",
        "(line 428,col 9)-(line 428,col 41)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiable)",
      "begin_line": 441,
      "end_line": 461,
      "comment": " Convert a {@link UnivariateDifferentiable} into a {@link DifferentiableUnivariateFunction}.\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 460,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-ed82bc00-cf53-4405-a3aa-9f08e923a9ab.value(double)",
      "begin_line": 446,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 17)-(line 447,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-16176312-885a-4987-aa6d-f3fbea91d028.derivative()",
      "begin_line": 451,
      "end_line": 458,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 17)-(line 457,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-997e5cdf-112d-439f-b7f2-aec3e89643d1.value(double)",
      "begin_line": 454,
      "end_line": 456,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 455,col 25)-(line 455,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.toUnivariateDifferential(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction)",
      "begin_line": 474,
      "end_line": 502,
      "comment": " Convert a {@link DifferentiableUnivariateFunction} into a {@link UnivariateDifferentiable}.\n     * \u003cp\u003e\n     * Note that the converted function is able to handle {@link DerivativeStructure} with\n     * \u003cem\u003eonly\u003c/em\u003e one parameter and up to order one. If the function is called with\n     * more parameters or higher order, a {@link DimensionMismatchException} will be thrown.\n     * \u003c/p\u003e\n     * @param f function to convert\n     * @return converted function\n     * @deprecated this conversion method is temporary in version 3.1, as the {@link\n     * DifferentiableUnivariateFunction} interface itself is deprecated\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 501,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-aca54efa-4067-4779-893b-d158cc01133c.value(double)",
      "begin_line": 479,
      "end_line": 481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 17)-(line 480,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-a21400b3-bc27-4e7e-ba47-20c652a6cd77.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 487,
      "end_line": 499,
      "comment": " {@inheritDoc}\n             * @exception DimensionMismatchException if number of parameters or derivation\n             * order are higher than 1\n             ",
      "child_ranges": [
        "(line 489,col 17)-(line 491,col 17)",
        "(line 492,col 17)-(line 494,col 17)",
        "(line 495,col 17)-(line 498,col 19)"
      ]
    }
  ]
}