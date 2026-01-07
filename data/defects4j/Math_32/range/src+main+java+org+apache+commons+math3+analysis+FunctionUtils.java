{
  "filepath": "/tmp/Math-32b/src/main/java/org/apache/commons/math3/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 336,
      "comment": "\n * Utilities for manipulating function objects.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.FunctionUtils()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Class only contains static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 45,
      "end_line": 56,
      "comment": "\n     * Compose functions.  The functions in the argument list are composed\n     * sequentially, in the order given.  For example, compose(f1,f2,f3)\n     * acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 55,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-4a0f279e-7f91-48c6-8bd9-a3ac51e93778.value(double)",
      "begin_line": 48,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 49,col 17)-(line 49,col 29)",
        "(line 50,col 17)-(line 52,col 17)",
        "(line 53,col 17)-(line 53,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 66,
      "end_line": 93,
      "comment": "\n     * Compose functions.  The functions in the argument list are composed\n     * sequentially, in the order given.  For example, compose(f1,f2,f3)\n     * acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 92,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-af8039bb-f2fb-489a-b7d6-c285e879d280.value(double)",
      "begin_line": 69,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 17)-(line 70,col 29)",
        "(line 71,col 17)-(line 73,col 17)",
        "(line 74,col 17)-(line 74,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-c9d389c7-5010-4c86-822c-57e45033a8d7.derivative()",
      "begin_line": 78,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 17)-(line 90,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-6cdaca02-780a-4227-88f9-4b1d0b7388d3.value(double)",
      "begin_line": 81,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 25)-(line 82,col 37)",
        "(line 83,col 25)-(line 83,col 37)",
        "(line 84,col 25)-(line 87,col 25)",
        "(line 88,col 25)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 101,
      "end_line": 112,
      "comment": "\n     * Add functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 111,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-1e352014-4f6b-483c-a428-65881eae0e83.value(double)",
      "begin_line": 104,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 17)-(line 105,col 41)",
        "(line 106,col 17)-(line 108,col 17)",
        "(line 109,col 17)-(line 109,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 120,
      "end_line": 145,
      "comment": "\n     * Add functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 144,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-190bed2f-2640-4065-829a-7e2eb38d1bcf.value(double)",
      "begin_line": 123,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 17)-(line 124,col 41)",
        "(line 125,col 17)-(line 127,col 17)",
        "(line 128,col 17)-(line 128,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-762088f5-8e7b-4471-9952-66cac1a6a482.derivative()",
      "begin_line": 132,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 17)-(line 142,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-e7f10f8b-025e-453a-be22-cb2238225e72.value(double)",
      "begin_line": 135,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 25)-(line 136,col 62)",
        "(line 137,col 25)-(line 139,col 25)",
        "(line 140,col 25)-(line 140,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.UnivariateFunction...)",
      "begin_line": 153,
      "end_line": 164,
      "comment": "\n     * Multiply functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 163,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-8ed71a82-0b5c-4036-badb-1ded5a66bc7c.value(double)",
      "begin_line": 156,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 17)-(line 157,col 41)",
        "(line 158,col 17)-(line 160,col 17)",
        "(line 161,col 17)-(line 161,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 172,
      "end_line": 203,
      "comment": "\n     * Multiply functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 202,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-5e2c0d6a-226f-45ee-bcc2-64ea2147846c.value(double)",
      "begin_line": 175,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 17)-(line 176,col 41)",
        "(line 177,col 17)-(line 179,col 17)",
        "(line 180,col 17)-(line 180,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-49268acf-5e4c-4d5c-96eb-e79f33d0f15b.derivative()",
      "begin_line": 184,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 17)-(line 200,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-e44d5d14-cf80-4fe2-8bf7-0e9a7ec75200.value(double)",
      "begin_line": 187,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 25)-(line 188,col 39)",
        "(line 189,col 25)-(line 197,col 25)",
        "(line 198,col 25)-(line 198,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.combine(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 214,
      "end_line": 223,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 222,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-83c47c89-c590-4829-8e65-5f42b0fd8cac.value(double)",
      "begin_line": 219,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 17)-(line 220,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, org.apache.commons.math3.analysis.UnivariateFunction, double)",
      "begin_line": 235,
      "end_line": 248,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 247,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-d610214c-afdf-45cd-8be0-97918921f48d.value(double[])",
      "begin_line": 240,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 17)-(line 241,col 80)",
        "(line 242,col 17)-(line 244,col 17)",
        "(line 245,col 17)-(line 245,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 271,
      "end_line": 279,
      "comment": "\n     * Create a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 278,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-5153d7d5-ae4b-422d-a772-00cc7dc30667.value(double)",
      "begin_line": 275,
      "end_line": 277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 276,col 17)-(line 276,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction, double)",
      "begin_line": 287,
      "end_line": 295,
      "comment": "\n     * Create a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 294,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.Anonymous-44355866-6ab8-4ca9-8efe-f04cdefc4442.value(double)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 17)-(line 292,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.FunctionUtils.sample(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 317,
      "end_line": 335,
      "comment": "\n     * \u003cp\u003e\n     * Samples the specified univariate real function on the specified interval.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The interval is divided equally into {@code n} sections and sample points\n     * are taken from {@code min} to {@code max - (max - min) / n}; therefore\n     * {@code f} is not sampled at the upper bound {@code max}.\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled\n     * @param min the (inclusive) lower bound of the interval\n     * @param max the (exclusive) upper bound of the interval\n     * @param n the number of sample points\n     * @return the array of samples\n     * @throws NumberIsTooLargeException if the lower bound {@code min} is\n     * greater than, or equal to the upper bound {@code max}\n     * @throws NotStrictlyPositiveException if the number of sample points\n     * {@code n} is negative\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 35)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 17)"
      ]
    }
  ]
}