{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/compiler/Path.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Path",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Expression"
      ],
      "begin_line": 41,
      "end_line": 333,
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
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create a new Path.\n     * @param steps that compose the Path\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.getSteps()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Get the steps.\n     * @return Step[]\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.computeContextDependent()",
      "begin_line": 66,
      "end_line": 75,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.isSimplePath()",
      "begin_line": 83,
      "end_line": 96,
      "comment": "\n     * Recognizes paths formatted as \u003ccode\u003efoo/bar[3]/baz[@name \u003d \u0027biz\u0027]\u003c/code\u003e.\n     * The evaluation of such \"simple\" paths is optimized and\n     * streamlined.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this path is simple\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.isSimpleStep(org.apache.commons.jxpath.ri.compiler.Step)",
      "begin_line": 105,
      "end_line": 129,
      "comment": "\n     * A Step is \"simple\" if it takes one of these forms: \".\", \"/foo\",\n     * \"@bar\", \"/foo[3]\". If there are predicates, they should be\n     * context independent for the step to still be considered simple.\n     * @param step the step to check\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.areBasicPredicates(org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 136,
      "end_line": 159,
      "comment": "\n     * Learn whether the elements of the specified array are \"basic\" predicates.\n     * @param predicates the Expression[] to check\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.getSingleNodePointerForSteps(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 167,
      "end_line": 180,
      "comment": "\n     * Given a root context, walks a path therefrom and finds the\n     * pointer to the first element matching the path.\n     * @param context evaluation context\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.searchForPath(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 202,
      "end_line": 232,
      "comment": "\n     * The idea here is to return a NullPointer rather than null if that\u0027s at\n     * all possible. Take for example this path: \"//map/key\". Let\u0027s say, \"map\"\n     * is an existing node, but \"key\" is not there. We will create a\n     * NullPointer that can be used to set/create the \"key\" property.\n     * \u003cp\u003e\n     * However, a path like \"//key\" would still produce null, because we have\n     * no way of knowing where \"key\" would be if it existed.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * To accomplish this, we first try the path itself. If it does not find\n     * anything, we chop off last step of the path, as long as it is a simple\n     * one like child:: or attribute:: and try to evaluate the truncated path.\n     * If it finds exactly one node - create a NullPointer and return. If it\n     * fails, chop off another step and repeat. If it finds more than one\n     * location - return null.\n     * \u003c/p\u003e\n     * @param context evaluation context\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 73)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.evalSteps(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Given a root context, walks a path therefrom and builds a context\n     * that contains all nodes matching the path.\n     * @param context evaluation context\n     * @return EvaluationContext\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.buildContextChain(org.apache.commons.jxpath.ri.EvalContext, int, boolean)",
      "begin_line": 251,
      "end_line": 278,
      "comment": "\n     * Build a context from a chain of contexts.\n     * @param context evaluation context\n     * @param stepCount number of steps to descend\n     * @param createInitialContext whether to create the initial context\n     * @return created context\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Path.createContextForStep(org.apache.commons.jxpath.ri.EvalContext, int, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 288,
      "end_line": 332,
      "comment": "\n     * Different axes are serviced by different contexts. This method\n     * allocates the right context for the supplied step.\n     * @param context evaluation context\n     * @param axis code\n     * @param nodeTest node test\n     * @return EvalContext\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 331,col 9)"
      ]
    }
  ]
}