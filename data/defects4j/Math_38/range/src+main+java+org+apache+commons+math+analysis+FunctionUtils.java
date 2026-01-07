{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 293,
      "comment": "\n * Utilities for manipulating function objects.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.FunctionUtils()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Class only contains static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.compose(org.apache.commons.math.analysis.UnivariateFunction...)",
      "begin_line": 42,
      "end_line": 53,
      "comment": "\n     * Compose functions.  The functions in the argument list are composed\n     * sequentially, in the order given.  For example, compose(f1,f2,f3)\n     * acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 52,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-b77a0d83-5281-4bb4-8596-db23b10d0b4d.value(double)",
      "begin_line": 45,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 46,col 17)-(line 46,col 29)",
        "(line 47,col 17)-(line 49,col 17)",
        "(line 50,col 17)-(line 50,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.compose(org.apache.commons.math.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 63,
      "end_line": 90,
      "comment": "\n     * Compose functions.  The functions in the argument list are composed\n     * sequentially, in the order given.  For example, compose(f1,f2,f3)\n     * acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 89,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-7f8284de-7d6d-459c-be59-ea13c2d7a508.value(double)",
      "begin_line": 66,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 17)-(line 67,col 29)",
        "(line 68,col 17)-(line 70,col 17)",
        "(line 71,col 17)-(line 71,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-d6a9db0f-40fe-4e66-b9d8-88ce4b8a3247.derivative()",
      "begin_line": 75,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 17)-(line 87,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-9df10e17-afcc-4cfb-ad2c-c7c2063bde5b.value(double)",
      "begin_line": 78,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 25)-(line 79,col 37)",
        "(line 80,col 25)-(line 80,col 37)",
        "(line 81,col 25)-(line 84,col 25)",
        "(line 85,col 25)-(line 85,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.add(org.apache.commons.math.analysis.UnivariateFunction...)",
      "begin_line": 98,
      "end_line": 109,
      "comment": "\n     * Add functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 108,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-1d35a75e-97fc-49ac-8f09-4e3404ac79e9.value(double)",
      "begin_line": 101,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 17)-(line 102,col 41)",
        "(line 103,col 17)-(line 105,col 17)",
        "(line 106,col 17)-(line 106,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.add(org.apache.commons.math.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 117,
      "end_line": 142,
      "comment": "\n     * Add functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 141,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-9e0ca5ce-a474-4f6c-8d82-107f327a34f8.value(double)",
      "begin_line": 120,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 17)-(line 121,col 41)",
        "(line 122,col 17)-(line 124,col 17)",
        "(line 125,col 17)-(line 125,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-66e5f477-d764-4804-9144-269a3ca3371b.derivative()",
      "begin_line": 129,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 17)-(line 139,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-0c4778fb-9634-4897-bd39-a776435ce380.value(double)",
      "begin_line": 132,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 25)-(line 133,col 62)",
        "(line 134,col 25)-(line 136,col 25)",
        "(line 137,col 25)-(line 137,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.multiply(org.apache.commons.math.analysis.UnivariateFunction...)",
      "begin_line": 150,
      "end_line": 161,
      "comment": "\n     * Multiply functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 160,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-2cbbaf0a-a327-4c72-9da3-52fead329d79.value(double)",
      "begin_line": 153,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 17)-(line 154,col 41)",
        "(line 155,col 17)-(line 157,col 17)",
        "(line 158,col 17)-(line 158,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.multiply(org.apache.commons.math.analysis.DifferentiableUnivariateFunction...)",
      "begin_line": 169,
      "end_line": 200,
      "comment": "\n     * Multiply functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 199,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-aee7c5b1-4b3c-44d1-8a66-0704eb81afdc.value(double)",
      "begin_line": 172,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 17)-(line 173,col 41)",
        "(line 174,col 17)-(line 176,col 17)",
        "(line 177,col 17)-(line 177,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-e0a1ab85-8558-4cc2-a516-7706b4178648.derivative()",
      "begin_line": 181,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 182,col 17)-(line 197,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-cf51b2d6-2cb3-4b5c-bdaf-2ca30b1687a6.value(double)",
      "begin_line": 184,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 25)-(line 185,col 39)",
        "(line 186,col 25)-(line 194,col 25)",
        "(line 195,col 25)-(line 195,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.combine(org.apache.commons.math.analysis.BivariateRealFunction, org.apache.commons.math.analysis.UnivariateFunction, org.apache.commons.math.analysis.UnivariateFunction)",
      "begin_line": 211,
      "end_line": 220,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 219,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-a4bba3b0-a570-490d-b46e-56da021c14a1.value(double)",
      "begin_line": 216,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 17)-(line 217,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.collector(org.apache.commons.math.analysis.BivariateRealFunction, org.apache.commons.math.analysis.UnivariateFunction, double)",
      "begin_line": 232,
      "end_line": 245,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 244,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-683f09fd-9695-44f1-b729-e7ce0d4c96ac.value(double[])",
      "begin_line": 237,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 17)-(line 238,col 80)",
        "(line 239,col 17)-(line 241,col 17)",
        "(line 242,col 17)-(line 242,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.collector(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * Returns a MultivariateFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 268,
      "end_line": 276,
      "comment": "\n     * Create a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 275,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-27ce00e4-4dda-439b-90b6-9aeb6126733c.value(double)",
      "begin_line": 272,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 17)-(line 273,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 284,
      "end_line": 292,
      "comment": "\n     * Create a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 291,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-97727863-d331-48a9-9f38-4aeadfd04a7c.value(double)",
      "begin_line": 288,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 17)-(line 289,col 41)"
      ]
    }
  ]
}