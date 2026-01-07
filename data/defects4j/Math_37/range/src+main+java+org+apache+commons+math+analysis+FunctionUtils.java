{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/analysis/FunctionUtils.java",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.FunctionUtils()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Class only contains static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.compose(org.apache.commons.math.analysis.UnivariateFunction...)",
      "begin_line": 45,
      "end_line": 56,
      "comment": "\n     * Compose functions.  The functions in the argument list are composed\n     * sequentially, in the order given.  For example, compose(f1,f2,f3)\n     * acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 55,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-7a9fdc83-69bf-491d-89fc-c2c6fc2db403.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.compose(org.apache.commons.math.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 66,
      "end_line": 93,
      "comment": "\n     * Compose functions.  The functions in the argument list are composed\n     * sequentially, in the order given.  For example, compose(f1,f2,f3)\n     * acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 92,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-5c9ea8bc-9648-45e1-9c26-1244a1345848.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-4234c312-a0ca-44e0-af4a-275078fa667b.derivative()",
      "begin_line": 78,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 17)-(line 90,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-ec3032c5-1b05-4ac4-b068-ee3b08cfaf82.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.add(org.apache.commons.math.analysis.UnivariateFunction...)",
      "begin_line": 101,
      "end_line": 112,
      "comment": "\n     * Add functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 111,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-817ea556-257c-4f22-a0a0-ccbfeab4a782.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.add(org.apache.commons.math.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 120,
      "end_line": 145,
      "comment": "\n     * Add functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 144,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-94dc594f-61f1-47c1-8e2e-ed432d6c66ce.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-e7887e3f-fc33-4b4a-b6e5-07a341197329.derivative()",
      "begin_line": 132,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 17)-(line 142,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-d57be000-1abb-4d68-a661-d3399d7efe0d.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.multiply(org.apache.commons.math.analysis.UnivariateFunction...)",
      "begin_line": 153,
      "end_line": 164,
      "comment": "\n     * Multiply functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 163,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-1803ec69-6088-4184-a420-afa4e21993bb.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.multiply(org.apache.commons.math.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 172,
      "end_line": 203,
      "comment": "\n     * Multiply functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 202,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-ad2370df-4fe5-4635-aefe-4c38158ec681.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-bdf6e86d-89de-49b7-8f8f-834d920cb233.derivative()",
      "begin_line": 184,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 17)-(line 200,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-a936aa0f-2fa0-4b3c-ba07-98d1bf7f91a7.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.combine(org.apache.commons.math.analysis.BivariateRealFunction, org.apache.commons.math.analysis.UnivariateFunction, org.apache.commons.math.analysis.UnivariateFunction)",
      "begin_line": 214,
      "end_line": 223,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 222,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-860693dc-56e0-4b8a-beae-c560e2b5ad50.value(double)",
      "begin_line": 219,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 17)-(line 220,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.collector(org.apache.commons.math.analysis.BivariateRealFunction, org.apache.commons.math.analysis.UnivariateFunction, double)",
      "begin_line": 235,
      "end_line": 248,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 247,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-f84961dc-5098-424f-b918-490b4ab3446d.value(double[])",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.collector(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 271,
      "end_line": 279,
      "comment": "\n     * Create a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 278,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-b828f909-0875-425d-8ffa-0683485d3a17.value(double)",
      "begin_line": 275,
      "end_line": 277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 276,col 17)-(line 276,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 287,
      "end_line": 295,
      "comment": "\n     * Create a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 294,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-d941ace5-f605-4817-9f1e-6abde21af434.value(double)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 17)-(line 292,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.sample(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
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