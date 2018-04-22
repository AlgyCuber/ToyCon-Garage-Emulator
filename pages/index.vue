<template>
  <section class="container">
    <div>
      <p id='output'><pre><code>{{nodes.json}}</code></pre></p>
      <svg>
        <rect class="node" x="220" y="70" width="100" height="100"/>
      </svg>
    </div>
  </section>
</template>

<script>
import TGNode from '~/assets/TGNode';
import json from '~/static/sample.json';

export default {
  data ({params}) {
    return { nodes: { json } }
  },
  mounted: function() {
    this.$nextTick(function() {
      const node = new TGNode('start');
      console.log(node.getName());
    });
  }
}
</script>

<style>
html, body {
  margin: 0;
  padding: 0;
  overflow: hidden;
}

svg {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  width: 100vw;
  height: 100vh;
  background-color: black;
  z-index: 1;
}

.node {
  fill: transparent;
  stroke: white;
  stroke-width: 2;
}

#output {
  position: fixed;
  top: 0;
  left: 0;
  color: #228822;
  z-index: 2;
}

/*.container {
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
}*/

/*.title {
  font-family: "Quicksand", "Source Sans Pro", -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
  display: block;
  font-weight: 300;
  font-size: 100px;
  color: #35495e;
  letter-spacing: 1px;
}*/

/*.subtitle {
  font-weight: 300;
  font-size: 42px;
  color: #526488;
  word-spacing: 5px;
  padding-bottom: 15px;
}*/

/*.links {
  padding-top: 15px;
}*/
</style>
