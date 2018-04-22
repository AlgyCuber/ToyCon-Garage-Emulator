<template>
  <section class="container">
    <div>
      <svg>
        <rect class="node" x="20" y="20" width="100" height="100"/>
      </svg>
    </div>
  </section>
</template>

<script>
import TGNode from '~/assets/TGNode';

export default {
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
}

.node {
  fill: transparent;
  stroke: white;
  stroke-width: 2;
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
