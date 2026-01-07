{
  "filepath": "/tmp/Math-73b/src/main/java/org/apache/commons/math/analysis/ComposableFunction.java",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-44e24b78-0ab3-453f-a483-eb1aa0847c43.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-7d4cb317-46c9-4cdf-bd88-63ba3b206437.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-5671699e-aac9-4596-8ecf-98ff9dede312.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-623081f6-8466-4734-9cc5-31b0e586fe2c.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-cc067ea2-a659-4da8-a762-661e4e223887.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-fc57d163-9183-499a-acc0-66fabd5195c5.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b6ade3f5-9035-4484-af31-24b60ff964ab.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-8e0e0030-74d3-4332-87cc-356d1403b45d.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-5ea2db3f-cae2-4ad3-a557-f73e97bf9ede.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-83a76239-f1ea-4bfe-8a71-86414bbe14f6.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-248c4584-8214-4007-ba52-05b9f4cd5fcb.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3ba5931b-ea02-4d61-8d24-c582db93afa5.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c37b1b75-99df-4a22-8fff-f61c47cc087a.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b52d9214-7f56-4c7c-a791-41ec09e6cc7d.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-1e4805e5-8ace-4d55-953e-9c1826d0b7b7.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-0c996f6c-20db-4e86-b7b4-c271e076e029.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-d2569707-bd0d-4cf7-8427-1ee60e9373ab.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-4561d23a-3fc3-434f-9df1-86a9fc381154.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3204a769-c4eb-48d3-ab2f-3013d48a4ecc.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-7517eab6-b597-4759-8cc6-7df57ac38385.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6925e7e0-1f2a-42fe-996d-dd5d018a7d1a.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3cd1bb2e-198e-4a30-a5fe-f5faafe02f76.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-33dccc13-54f4-4eba-a66d-18f3f0d1b14b.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-773d3032-a59c-4383-9295-a5f5e0572c43.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-a23236ca-2326-41eb-bed0-6ccd32296d0b.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b0142b93-e255-4419-a95a-d4e6c3f7c551.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-04ff0685-4e89-4a8e-a3a2-c2798068c6ae.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-aecae242-bd7b-455d-b12c-bb59d4050051.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-60a17fc5-c338-46d1-a22f-2287e1dd638e.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3abdd2f5-f31b-4e92-8b6c-1b57d6ac41fd.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c4a6ba24-c623-4ff9-8313-1c812e9f161d.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-84735201-d1bd-4704-a41f-8481c624bfba.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-2c05a6cc-78f3-44c2-aafe-faf28d5f8256.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-93156384-2927-4f4a-b734-5b007d7aa1fd.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-51940d8d-c072-4c7b-a2ae-12cc1ac8d74f.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-5eb91dd4-8879-407d-bd40-8ed5f6c7b5df.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-dae044be-2bb8-4b1a-b62e-971e4dbec258.value(double[])",
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