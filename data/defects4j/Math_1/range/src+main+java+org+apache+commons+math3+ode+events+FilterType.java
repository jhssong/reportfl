{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/ode/events/FilterType.java",
  "nodes": [
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.FilterType.getTriggeredIncreasing()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.FilterType.selectTransformer(org.apache.commons.math3.ode.events.Transformer, double, boolean)",
      "begin_line": 90,
      "end_line": 204,
      "comment": " {@inheritDoc}\n         * \u003cp\u003e\n         * states scheduling for computing h(t,y) as an altered version of g(t, y)\n         * \u003cul\u003e\n         * \u003cli\u003e0 are triggered events for which a zero is produced (here decreasing events)\u003c/li\u003e\n         * \u003cli\u003eX are ignored events for which zero is masked (here increasing events)\u003c/li\u003e\n         * \u003c/ul\u003e\n         * \u003c/p\u003e\n         * \u003cpre\u003e\n         *  g(t)\n         *             ___                     ___                     ___\n         *            /   \\                   /   \\                   /   \\\n         *           /     \\                 /     \\                 /     \\\n         *          /  g\u003e0  \\               /  g\u003e0  \\               /  g\u003e0  \\\n         *         /         \\             /         \\             /         \\\n         *  ----- X --------- 0 --------- X --------- 0 --------- X --------- 0 ---\n         *       /             \\         /             \\         /             \\\n         *      /               \\ g\u003c0   /               \\  g\u003c0  /               \\ g\u003c0\n         *     /                 \\     /                 \\     /                 \\     /\n         * ___/                   \\___/                   \\___/                   \\___/\n         * \u003c/pre\u003e\n         * \u003cpre\u003e\n         *  h(t,y)) as an alteration of g(t,y)\n         *             ___                                 ___         ___\n         *    \\       /   \\                               /   \\       /   \\\n         *     \\     /     \\ h\u003d+g                        /     \\     /     \\\n         *      \\   /       \\      h\u003dmin(-s,-g,+g)      /       \\   /       \\\n         *       \\_/         \\                         /         \\_/         \\\n         *  ------ ---------- 0 ----------_---------- 0 --------------------- 0 ---\n         *                     \\         / \\         /                         \\\n         *   h\u003dmax(+s,-g,+g)    \\       /   \\       /       h\u003dmax(+s,-g,+g)     \\\n         *                       \\     /     \\     / h\u003d-g                        \\     /\n         *                        \\___/       \\___/                               \\___/\n         * \u003c/pre\u003e\n         * \u003cp\u003e\n         * As shown by the figure above, several expressions are used to compute h,\n         * depending on the current state:\n         * \u003cul\u003e\n         *   \u003cli\u003eh \u003d max(+s,-g,+g)\u003c/li\u003e\n         *   \u003cli\u003eh \u003d +g\u003c/li\u003e\n         *   \u003cli\u003eh \u003d min(-s,-g,+g)\u003c/li\u003e\n         *   \u003cli\u003eh \u003d -g\u003c/li\u003e\n         * \u003c/ul\u003e\n         * where s is a tiny positive value: {@link org.apache.commons.math3.util.Precision#SAFE_MIN}.\n         * \u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 93,col 13)-(line 203,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.FilterType.getTriggeredIncreasing()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.FilterType.selectTransformer(org.apache.commons.math3.ode.events.Transformer, double, boolean)",
      "begin_line": 268,
      "end_line": 382,
      "comment": " {@inheritDoc}\n         * \u003cp\u003e\n         * states scheduling for computing h(t,y) as an altered version of g(t, y)\n         * \u003cul\u003e\n         * \u003cli\u003e0 are triggered events for which a zero is produced (here increasing events)\u003c/li\u003e\n         * \u003cli\u003eX are ignored events for which zero is masked (here decreasing events)\u003c/li\u003e\n         * \u003c/ul\u003e\n         * \u003c/p\u003e\n         * \u003cpre\u003e\n         *  g(t)\n         *             ___                     ___                     ___\n         *            /   \\                   /   \\                   /   \\\n         *           /     \\                 /     \\                 /     \\\n         *          /  g\u003e0  \\               /  g\u003e0  \\               /  g\u003e0  \\\n         *         /         \\             /         \\             /         \\\n         *  ----- 0 --------- X --------- 0 --------- X --------- 0 --------- X ---\n         *       /             \\         /             \\         /             \\\n         *      /               \\ g\u003c0   /               \\  g\u003c0  /               \\ g\u003c0\n         *     /                 \\     /                 \\     /                 \\     /\n         * ___/                   \\___/                   \\___/                   \\___/\n         * \u003c/pre\u003e\n         * \u003cpre\u003e\n         *  h(t,y)) as an alteration of g(t,y)\n         *                                     ___         ___\n         *    \\                               /   \\       /   \\\n         *     \\ h\u003d-g                        /     \\     /     \\ h\u003d-g\n         *      \\      h\u003dmin(-s,-g,+g)      /       \\   /       \\      h\u003dmin(-s,-g,+g)\n         *       \\                         /         \\_/         \\\n         *  ------0 ----------_---------- 0 --------------------- 0 --------- _ ---\n         *         \\         / \\         /                         \\         / \\\n         *          \\       /   \\       /       h\u003dmax(+s,-g,+g)     \\       /   \\\n         *           \\     /     \\     / h\u003d+g                        \\     /     \\     /\n         *            \\___/       \\___/                               \\___/       \\___/\n         * \u003c/pre\u003e\n         * \u003cp\u003e\n         * As shown by the figure above, several expressions are used to compute h,\n         * depending on the current state:\n         * \u003cul\u003e\n         *   \u003cli\u003eh \u003d max(+s,-g,+g)\u003c/li\u003e\n         *   \u003cli\u003eh \u003d +g\u003c/li\u003e\n         *   \u003cli\u003eh \u003d min(-s,-g,+g)\u003c/li\u003e\n         *   \u003cli\u003eh \u003d -g\u003c/li\u003e\n         * \u003c/ul\u003e\n         * where s is a tiny positive value: {@link org.apache.commons.math3.util.Precision#SAFE_MIN}.\n         * \u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 271,col 13)-(line 381,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.FilterType.getTriggeredIncreasing()",
      "begin_line": 389,
      "end_line": 389,
      "comment": " Get the increasing status of triggered events.\n     * @return true if triggered events are increasing events\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.FilterType.selectTransformer(org.apache.commons.math3.ode.events.Transformer, double, boolean)",
      "begin_line": 398,
      "end_line": 399,
      "comment": " Get next function transformer in the specified direction.\n     * @param previous transformer active on the previous point with respect\n     * to integration direction (may be null if no previous point is known)\n     * @param g current value of the g function\n     * @param forward true if integration goes forward\n     * @return next transformer transformer\n     ",
      "child_ranges": []
    }
  ]
}