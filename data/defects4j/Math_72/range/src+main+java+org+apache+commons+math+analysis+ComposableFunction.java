{
  "filepath": "/tmp/Math-72b/src/main/java/org/apache/commons/math/analysis/ComposableFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComposableFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 28,
      "end_line": 504,
      "comment": "\n * Base class for {@link UnivariateRealFunction} that can be composed with other functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 31,
      "end_line": 37,
      "comment": " The constant function always returning 0. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-ee8efd1a-e5b4-44b3-aa87-99d3262de3b9.value(double)",
      "begin_line": 33,
      "end_line": 36,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 35,col 13)-(line 35,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 40,
      "end_line": 46,
      "comment": " The constant function always returning 1. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3344a7b2-bf5f-49e1-8806-64da3a2444b3.value(double)",
      "begin_line": 42,
      "end_line": 45,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 44,col 13)-(line 44,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "IDENTITY"
      ],
      "begin_line": 49,
      "end_line": 55,
      "comment": " The identity function. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-23cf2206-24d7-443f-af47-937daff37526.value(double)",
      "begin_line": 51,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ABS"
      ],
      "begin_line": 58,
      "end_line": 64,
      "comment": " The {@code Math.abs} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-74938086-e213-42e0-8330-49e13e8e55ec.value(double)",
      "begin_line": 60,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NEGATE"
      ],
      "begin_line": 67,
      "end_line": 73,
      "comment": " The - operator wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-45e88748-f791-447b-920b-272746856a99.value(double)",
      "begin_line": 69,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "INVERT"
      ],
      "begin_line": 76,
      "end_line": 82,
      "comment": " The invert operator wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-5185993c-500a-4f48-b70d-6b6598cfd3be.value(double)",
      "begin_line": 78,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SIN"
      ],
      "begin_line": 85,
      "end_line": 91,
      "comment": " The {@code Math.sin} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-43a37d59-310d-4aa6-bb54-b851e2840698.value(double)",
      "begin_line": 87,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SQRT"
      ],
      "begin_line": 94,
      "end_line": 100,
      "comment": " The {@code Math.sqrt} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-56a01c7e-3dce-4e77-8baa-edcc42b84cab.value(double)",
      "begin_line": 96,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SINH"
      ],
      "begin_line": 103,
      "end_line": 109,
      "comment": " The {@code Math.sinh} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-edf1c5cc-988b-451b-99e5-ee113b825e82.value(double)",
      "begin_line": 105,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EXP"
      ],
      "begin_line": 112,
      "end_line": 118,
      "comment": " The {@code Math.exp} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c074316c-b57b-417e-9f4b-cc756710ade2.value(double)",
      "begin_line": 114,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EXPM1"
      ],
      "begin_line": 121,
      "end_line": 127,
      "comment": " The {@code Math.expm1} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-cb0bb336-3d0f-4a11-94fe-777c7fb0f9f6.value(double)",
      "begin_line": 123,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ASIN"
      ],
      "begin_line": 130,
      "end_line": 136,
      "comment": " The {@code Math.asin} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6257eed3-7f89-442c-a8e4-1630220071ad.value(double)",
      "begin_line": 132,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ATAN"
      ],
      "begin_line": 139,
      "end_line": 145,
      "comment": " The {@code Math.atan} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-7fd01526-5cb0-48d8-bc72-85b9711d32ba.value(double)",
      "begin_line": 141,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TAN"
      ],
      "begin_line": 148,
      "end_line": 154,
      "comment": " The {@code Math.tan} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-1297c6db-ec04-45fa-ad7b-8b730a7033e5.value(double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TANH"
      ],
      "begin_line": 157,
      "end_line": 163,
      "comment": " The {@code Math.tanh} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-cdc68fa5-04e0-458a-973d-7e27296eb2a6.value(double)",
      "begin_line": 159,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CBRT"
      ],
      "begin_line": 166,
      "end_line": 172,
      "comment": " The {@code Math.cbrt} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-10ed5927-ad5a-4827-9848-b5069aee94e8.value(double)",
      "begin_line": 168,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CEIL"
      ],
      "begin_line": 175,
      "end_line": 181,
      "comment": " The {@code Math.ceil} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-09d12139-7ca3-48e1-82c9-a558ecc71e15.value(double)",
      "begin_line": 177,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FLOOR"
      ],
      "begin_line": 184,
      "end_line": 190,
      "comment": " The {@code Math.floor} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-22303272-9a95-4770-a071-99540e396aba.value(double)",
      "begin_line": 186,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LOG"
      ],
      "begin_line": 193,
      "end_line": 199,
      "comment": " The {@code Math.log} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-a25b1b75-1439-4852-86bb-24b46e12aa95.value(double)",
      "begin_line": 195,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LOG10"
      ],
      "begin_line": 202,
      "end_line": 208,
      "comment": " The {@code Math.log10} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-ed1e4f65-980f-4a77-9a6c-2fd89defa588.value(double)",
      "begin_line": 204,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LOG1P"
      ],
      "begin_line": 211,
      "end_line": 216,
      "comment": " The {@code Math.log1p} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-edf19ed3-878a-46d1-8373-7f42699df402.value(double)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "COS"
      ],
      "begin_line": 219,
      "end_line": 225,
      "comment": " The {@code Math.cos} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-2658d2b2-508d-4bca-9d37-b72148ea2f1d.value(double)",
      "begin_line": 221,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ACOS"
      ],
      "begin_line": 228,
      "end_line": 234,
      "comment": " The {@code Math.abs} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-af5976f9-4a44-4498-b530-a953da483329.value(double)",
      "begin_line": 230,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "COSH"
      ],
      "begin_line": 237,
      "end_line": 243,
      "comment": " The {@code Math.cosh} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-e1d1c0e8-d6de-4eca-b2f5-5812e68d9e04.value(double)",
      "begin_line": 239,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "RINT"
      ],
      "begin_line": 246,
      "end_line": 252,
      "comment": " The {@code Math.rint} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b8b26df2-9d52-4d90-8ee6-cc9c1c33e593.value(double)",
      "begin_line": 248,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SIGNUM"
      ],
      "begin_line": 255,
      "end_line": 261,
      "comment": " The {@code Math.signum} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-89e57f78-909a-4d10-9c17-bb9168bf4fa7.value(double)",
      "begin_line": 257,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ULP"
      ],
      "begin_line": 264,
      "end_line": 270,
      "comment": " The {@code Math.ulp} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3e8b3d41-2541-4943-b1a6-1c39ea3d4ce6.value(double)",
      "begin_line": 266,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.of(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 281,
      "end_line": 289,
      "comment": " Precompose the instance with another function.\n     * \u003cp\u003e\n     * The composed function h created by {@code h \u003d g.of(f)} is such\n     * that {@code h.value(x) \u003d\u003d g.value(f.value(x))} for all x.\n     * \u003c/p\u003e\n     * @param f function to compose with\n     * @return a new function which computes {@code this.value(f.value(x))}\n     * @see #postCompose(UnivariateRealFunction)\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 288,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-1cfa567b-2991-4771-a5b2-9c841011ade0.value(double)",
      "begin_line": 283,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 17)-(line 286,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.postCompose(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 300,
      "end_line": 308,
      "comment": " Postcompose the instance with another function.\n     * \u003cp\u003e\n     * The composed function h created by {@code h \u003d g.postCompose(f)} is such\n     * that {@code h.value(x) \u003d\u003d f.value(g.value(x))} for all x.\n     * \u003c/p\u003e\n     * @param f function to compose with\n     * @return a new function which computes {@code f.value(this.value(x))}\n     * @see #of(UnivariateRealFunction)\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 307,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-e5321db2-3ee0-454c-ac06-c012390c56e0.value(double)",
      "begin_line": 302,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 17)-(line 305,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.combine(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.analysis.BivariateRealFunction)",
      "begin_line": 320,
      "end_line": 329,
      "comment": "\n     * Return a function combining the instance and another function.\n     * \u003cp\u003e\n     * The function h created by {@code h \u003d g.combine(f, combiner)} is such that\n     * {@code h.value(x) \u003d\u003d combiner.value(g.value(x), f.value(x))} for all x.\n     * \u003c/p\u003e\n     * @param f function to combine with the instance\n     * @param combiner bivariate function used for combining\n     * @return a new function which computes {@code combine.value(this.value(x), f.value(x))}\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 328,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-a5600176-7570-4e76-a49d-e929dbd47ce7.value(double)",
      "begin_line": 323,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 17)-(line 326,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.add(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 336,
      "end_line": 344,
      "comment": "\n     * Return a function adding the instance and another function.\n     * @param f function to combine with the instance\n     * @return a new function which computes {@code this.value(x) + f.value(x)}\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 343,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-cdc9ccd6-7ccb-4ffd-a94a-0f8a03364548.value(double)",
      "begin_line": 338,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 17)-(line 341,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.add(double)",
      "begin_line": 351,
      "end_line": 359,
      "comment": "\n     * Return a function adding a constant term to the instance.\n     * @param a term to add\n     * @return a new function which computes {@code this.value(x) + a}\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 358,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-a6215201-0be4-4d8f-ab40-1ae06b7ac0c7.value(double)",
      "begin_line": 353,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 17)-(line 356,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.subtract(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 366,
      "end_line": 374,
      "comment": "\n     * Return a function subtracting another function from the instance.\n     * @param f function to combine with the instance\n     * @return a new function which computes {@code this.value(x) - f.value(x)}\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 373,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-7c74b061-0b41-4889-a9a9-0a6fd3c7ff89.value(double)",
      "begin_line": 368,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 371,col 17)-(line 371,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.multiply(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 381,
      "end_line": 389,
      "comment": "\n     * Return a function multiplying the instance and another function.\n     * @param f function to combine with the instance\n     * @return a new function which computes {@code this.value(x) * f.value(x)}\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 388,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-69b5b72d-a498-47c0-aba2-76b2cdd541e6.value(double)",
      "begin_line": 383,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 17)-(line 386,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.multiply(double)",
      "begin_line": 396,
      "end_line": 404,
      "comment": "\n     * Return a function scaling the instance by a constant factor.\n     * @param scaleFactor constant scaling factor\n     * @return a new function which computes {@code this.value(x) * scaleFactor}\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 403,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-d421e984-4474-4c5b-bd6b-edcc03066b12.value(double)",
      "begin_line": 398,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 401,col 17)-(line 401,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.divide(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 410,
      "end_line": 418,
      "comment": "\n     * Return a function dividing the instance by another function.\n     * @param f function to combine with the instance\n     * @return a new function which computes {@code this.value(x) / f.value(x)}\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 417,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-d041738e-8823-4776-af51-7364ecbe79ac.value(double)",
      "begin_line": 412,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 17)-(line 415,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.asCollector(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 437,
      "end_line": 450,
      "comment": "\n     * Generates a function that iteratively apply instance function on all\n     * elements of an array.\n     * \u003cp\u003e\n     * The generated function behaves as follows:\n     * \u003cul\u003e\n     *   \u003cli\u003einitialize result \u003d initialValue\u003c/li\u003e\n     *   \u003cli\u003eiterate: {@code result \u003d combiner.value(result,\n     *   this.value(nextMultivariateEntry));}\u003c/li\u003e\n     *   \u003cli\u003ereturn result\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param combiner combiner to use between entries\n     * @param initialValue initial value to use before first entry\n     * @return a new function that iteratively applie instance function on all\n     * elements of an array.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 449,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-9c96fb95-56dc-4d19-afb0-0c8f5a2fb0bb.value(double[])",
      "begin_line": 441,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 443,col 17)-(line 443,col 45)",
        "(line 444,col 17)-(line 446,col 17)",
        "(line 447,col 17)-(line 447,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.asCollector(org.apache.commons.math.analysis.BivariateRealFunction)",
      "begin_line": 464,
      "end_line": 466,
      "comment": "\n     * Generates a function that iteratively apply instance function on all\n     * elements of an array.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@link\n     * #asCollector(BivariateRealFunction, double) asCollector(BivariateRealFunction, 0.0)}.\n     * \u003c/p\u003e\n     * @param combiner combiner to use between entries\n     * @return a new function that iteratively applie instance function on all\n     * elements of an array.\n     * @see #asCollector(BivariateRealFunction, double)\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.asCollector(double)",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Generates a function that iteratively apply instance function on all\n     * elements of an array.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@link\n     * #asCollector(BivariateRealFunction, double) asCollector(BinaryFunction.ADD, initialValue)}.\n     * \u003c/p\u003e\n     * @param initialValue initial value to use before first entry\n     * @return a new function that iteratively applie instance function on all\n     * elements of an array.\n     * @see #asCollector(BivariateRealFunction, double)\n     * @see BinaryFunction#ADD\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.asCollector()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * Generates a function that iteratively apply instance function on all\n     * elements of an array.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@link\n     * #asCollector(BivariateRealFunction, double) asCollector(BinaryFunction.ADD, 0.0)}.\n     * \u003c/p\u003e\n     * @return a new function that iteratively applie instance function on all\n     * elements of an array.\n     * @see #asCollector(BivariateRealFunction, double)\n     * @see BinaryFunction#ADD\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.value(double)",
      "begin_line": 502,
      "end_line": 502,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}