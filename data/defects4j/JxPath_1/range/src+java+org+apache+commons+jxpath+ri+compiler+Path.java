{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/compiler/Path.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Path",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Expression"
      ],
      "begin_line": 41,
      "end_line": 303,
      "comment": "\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "steps"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "basicKnown"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "basic"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.Path(org.apache.commons.jxpath.ri.compiler.Step[])",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.getSteps()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.computeContextDependent()",
      "begin_line": 55,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 62,col 9)",
        "(line 64,col 9)-(line 64,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.isSimplePath()",
      "begin_line": 72,
      "end_line": 85,
      "comment": "\n     * Recognized  paths formatted as \u003ccode\u003efoo/bar[3]/baz[@name \u003d \u0027biz\u0027]\n     * \u003c/code\u003e.  The evaluation of such \"simple\" paths is optimized and\n     * streamlined.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.isSimpleStep(org.apache.commons.jxpath.ri.compiler.Step)",
      "begin_line": 92,
      "end_line": 117,
      "comment": "\n     * A Step is \"simple\" if it takes one of these forms: \".\", \"/foo\",\n     * \"@bar\", \"/foo[3]\". If there are predicates, they should be \n     * context independent for the step to still be considered simple.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.areBasicPredicates(org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 119,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.getSingleNodePointerForSteps(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 148,
      "end_line": 163,
      "comment": "\n     * Given a root context, walks a path therefrom and finds the\n     * pointer to the first element matching the path.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.searchForPath(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 183,
      "end_line": 213,
      "comment": "\n     * The idea here is to return a NullPointer rather than null if that\u0027s at\n     * all possible. Take for example this path: \"//map/key\". Let\u0027s say, \"map\"\n     * is an existing node, but \"key\" is not there. We will create a\n     * NullPointer that can be used to set/create the \"key\" property.\n     * \u003cp\u003e\n     * However, a path like \"//key\" would still produce null, because we have\n     * no way of knowing where \"key\" would be if it existed.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * To accomplish this, we first try the path itself. If it does not find\n     * anything, we chop off last step of the path, as long as it is a simple\n     * one like child:: or attribute:: and try to evaluate the truncated path.\n     * If it finds exactly one node - create a NullPointer and return. If it\n     * fails, chop off another step and repeat. If it finds more than one\n     * location - return null.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 73)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.evalSteps(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Given a root context, walks a path therefrom and builds a context\n     * that contains all nodes matching the path.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.buildContextChain(org.apache.commons.jxpath.ri.EvalContext, int, boolean)",
      "begin_line": 223,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.createContextForStep(org.apache.commons.jxpath.ri.EvalContext, int, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 257,
      "end_line": 302,
      "comment": "\n     * Different axes are serviced by different contexts. This method\n     * allocates the right context for the supplied step.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 20)"
      ]
    }
  ]
}